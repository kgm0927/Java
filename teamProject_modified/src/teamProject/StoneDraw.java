package teamProject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

class StoneDraw implements MouseListener {
    JPanel contentPane = null;
    final int STONE_SIZE = 26;
    Color StoneColor = Color.BLACK; // computer white

    int[][] OmockBoard = new int[15][15];

    ScoringStrategy scoringStrategy = new FiveInRowScoring(); // Set default strategy

    public StoneDraw(JPanel c) {
        super();
        contentPane = c;
        for (int i = 0; i < 15; i++)
            for (int j = 0; j < 15; j++)
                OmockBoard[i][j] = 0;

        OmockBoard[7][7] = 1;
    }

    private void placeStone(int i, int j, int color) {
        OmockBoard[i][j] = color;

        Graphics g = contentPane.getGraphics();
        g.setColor(StoneColor);

        int X = i * 30 + 10 - STONE_SIZE / 2;
        int Y = j * 30 + 10 - STONE_SIZE / 2;
        g.fillOval(X, Y, STONE_SIZE, STONE_SIZE);
    }

    private void checkAndShowWinner(int i, int j) {
        if (checkNinLine(i, j, OmockBoard[i][j], 5) > 0) {
            if (StoneColor.equals(Color.BLACK))
                JOptionPane.showMessageDialog(null, "Black Win");
            else
                JOptionPane.showMessageDialog(null, "White Win");
            System.exit(0);
        }
    }

    private void makeMove(int i, int j, int color) {
        placeStone(i, j, color);
        checkAndShowWinner(i, j);
    }

    public int scoreVarEstimation(int x, int y, int c) {
        int score = 0;

        // 가로 방향 체크
        int count = 1; // 현재 위치의 돌을 포함하여 1로 초기화
        int i = x + 1;
        while (i < 15 && OmockBoard[i][y] == c) {
            count++;
            i++;
        }
        i = x - 1;
        while (i >= 0 && OmockBoard[i][y] == c) {
            count++;
            i--;
        }
        score += getScore(count, c);

        // 세로 방향 체크
        count = 1;
        int j = y + 1;
        while (j < 15 && OmockBoard[x][j] == c) {
            count++;
            j++;
        }
        j = y - 1;
        while (j >= 0 && OmockBoard[x][j] == c) {
            count++;
            j--;
        }
        score += getScore(count, c);

        // 대각선 방향 (왼쪽 위에서 오른쪽 아래로) 체크
        count = 1;
        i = x + 1;
        j = y + 1;
        while (i < 15 && j < 15 && OmockBoard[i][j] == c) {
            count++;
            i++;
            j++;
        }
        i = x - 1;
        j = y - 1;
        while (i >= 0 && j >= 0 && OmockBoard[i][j] == c) {
            count++;
            i--;
            j--;
        }
        score += getScore(count, c);

        // 대각선 방향 (오른쪽 위에서 왼쪽 아래로) 체크
        count = 1;
        i = x - 1;
        j = y + 1;
        while (i >= 0 && j < 15 && OmockBoard[i][j] == c) {
            count++;
            i--;
            j++;
        }
        i = x + 1;
        j = y - 1;
        while (i < 15 && j >= 0 && OmockBoard[i][j] == c) {
            count++;
            i++;
            j--;
        }
        score += getScore(count, c);

        return score;
    }
    
    private int getScore(int count, int c) {
        int score = 0;

        if (count >= 5) {
            score = 100; // 5목이 완성되면 최고 점수 부여
        } else if (count == 4) {
            if (c == 1) {
                score = 90; // 상대방 4목 막기
            } else {
                score = 80; // AI 4목 만들기
            }
        } else if (count == 3) {
            if (c == 1) {
                score = 70; // 상대방 3목 막기
            } else {
                score = 60; // AI 3목 만들기
            }
        } else if (count == 2) {
            if (c == 1) {
                score = 50; // 상대방 2목 막기
            } else {
                score = 40; // AI 2목 만들기
            }
        } else if (count == 1) {
            if (c == 1) {
                score = 30; // 상대방 1목 막기
            } else {
                score = 20; // AI 1목 만들기
            }
        }

        return score;
    }

    public P GameTree(int c, int limit) {
        return getPositionForMax(c, limit, 0);
    }

    private P createCompositeP() {
        return new CompositeP();
    }

    private P getPositionForMax(int c, int limit, int cur_score) {
        P result = createCompositeP();
        int maxScore = Integer.MIN_VALUE;

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (OmockBoard[i][j] == 0) {
                    OmockBoard[i][j] = c;
                    int score = scoreVarEstimation(i, j, c);
                    int totalScore = cur_score + score;

                    if (limit > 1) {
                        P nextPosition = getPositionForMin(3 - c, limit - 1, totalScore);
                        CompositeP compositeResult = (CompositeP) result;
                        compositeResult.add(nextPosition);
                        if (nextPosition.getMax() > maxScore) {
                            maxScore = nextPosition.getMax();
                            result.i = i;
                            result.j = j;
                        }
                    } else {
                        if (totalScore > maxScore) {
                            maxScore = totalScore;
                            result.i = i;
                            result.j = j;
                        }
                    }

                    OmockBoard[i][j] = 0;
                }
            }
        }

        return result;
    }

    private P getPositionForMin(int c, int limit, int cur_score) {
        P result = createCompositeP();
        int maxScore = Integer.MIN_VALUE;

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (OmockBoard[i][j] == 0) {
                    OmockBoard[i][j] = c;
                    int score = scoreVarEstimation(i, j, c);
                    int totalScore = cur_score + score;

                    if (limit > 1) {
                        P nextPosition = getPositionForMin(3 - c, limit - 1, totalScore);
                        CompositeP compositeResult = (CompositeP) result;
                        compositeResult.add(nextPosition);
                        if (nextPosition.getMax() > maxScore) {
                            maxScore = nextPosition.getMax();
                            result.i = i;
                            result.j = j;
                        }
                    } else {
                        if (totalScore > maxScore) {
                            maxScore = totalScore;
                            result.i = i;
                            result.j = j;
                        }
                    }

                    OmockBoard[i][j] = 0;
                }
            }
        }

        return result;
    }

    public void AIStoneDraw() {
        int color = 2;
        if (StoneColor.equals(Color.BLACK)) {
            StoneColor = Color.WHITE;
            color = 2;
        } else {
            StoneColor = Color.BLACK;
            color = 1;
        }

        P next_P = GameTree(color, 1);

        int i = next_P.i;
        int j = next_P.j;
        placeStone(i, j, color);

        checkAndShowWinner(i, j);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = contentPane.getGraphics();

        int i = (e.getX() - 10 + 15) / 30;
        int j = (e.getY() - 10 + 15) / 30;

        if (OmockBoard[i][j] != 0)
            return;

        if (StoneColor.equals(Color.BLACK)) {
            StoneColor = Color.WHITE;
            makeMove(i, j, 2);
        } else {
            StoneColor = Color.BLACK;
            makeMove(i, j, 1);
        }

        AIStoneDraw();
    }

    // Other MouseListener methods...

    public int checkNinLine(int x, int y, int c, int n) {
        int noOfNinLine = 0;

        int h = 1;
        for (int i = x + 1; i >= 0 && i < 15 && c == OmockBoard[i][y]; i++)
            h++;
        for (int i = x - 1; i >= 0 && i < 15 && c == OmockBoard[i][y]; i--)
            h++;
        if (h == n)
            noOfNinLine++;

        int v = 1;
        for (int i = y + 1; i >= 0 && i < 15 && c == OmockBoard[x][i]; i++)
            v++;
        for (int i = y - 1; i >= 0 && i < 15 && c == OmockBoard[x][i]; i--)
            v++;
        if (v == n)
            noOfNinLine++;

        int ld = 1;
        for (int i = 1; x + i >= 0 && x + i < 15 && y + i >= 0 && y + i < 15 && c == OmockBoard[x + i][y + i]; i++)
            ld++;
        for (int i = 1; x - i >= 0 && x - i < 15 && y - i >= 0 && y - i < 15 && c == OmockBoard[x - i][y - i]; i++)
            ld++;
        if (ld == n)
            noOfNinLine++;

        int rd = 1;
        for (int i = 1; x - i >= 0 && x - i < 15 && y + i >= 0 && y + i < 15 && c == OmockBoard[x - i][y + i]; i++)
            rd++;
        for (int i = 1; x + i >= 0 && x + i < 15 && y - i >= 0 && y - i < 15 && c == OmockBoard[x + i][y - i]; i++)
            rd++;
        if (rd == n)
            noOfNinLine++;

        return noOfNinLine;
    }

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
