package teamProject;


public class FiveInRowScoring implements ScoringStrategy{
	@Override
	public int calculateScore(int count, int c) {
        if (count >= 5) {
            return 100;
        } else if (count == 4) {
            return (c == 1) ? 90 : 80;
        } else if (count == 3) {
            return (c == 1) ? 70 : 60;
        } else if (count == 2) {
            return (c == 1) ? 50 : 40;
        } else if (count == 1) {
            return (c == 1) ? 30 : 20;
        }
        return 0;
    }
}
