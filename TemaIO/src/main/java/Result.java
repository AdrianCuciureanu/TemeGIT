import java.util.Objects;

public class Result implements Comparable<Result> {
    private String athleteNumber;
    private String athleteName;
    private String countryCode;
    private String skyTimeResult;
    private String firstShootingRange;
    private String secondShootingRange;
    private String thirdShootingRange;
    private int finalResultInSeconds;
    private int penaltyInSeconds;

    public Result() {
    }

    public Result(String athleteNumber, String athleteName, String countryCode, String skyTimeResult, String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skyTimeResult = skyTimeResult;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
        penaltyInSeconds = setPenaltyInSeconds();
        finalResultInSeconds = setFinalResultInSeconds();
    }

    private int timeInSeconds() {
        int res = 0;
        String stringElements[] = this.skyTimeResult.split(":");
        res = (Integer.parseInt(stringElements[0]) * 10) + Integer.parseInt(stringElements[1]);
        return res;
    }

    private int penalty() {
        String stringForPenalty = this.firstShootingRange + this.secondShootingRange + this.thirdShootingRange;
        Character chCheck = 'o';
        for (int i = 0; i < stringForPenalty.length(); i++) {
            if (chCheck.equals(stringForPenalty.charAt(i))) {
                this.penaltyInSeconds += 10;
            }
        }
        return penaltyInSeconds;
    }

    public void setAthleteNumber(String athleteNumber) {
        this.athleteNumber = athleteNumber;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setSkyTimeResult(String skyTimeResult) {
        this.skyTimeResult = skyTimeResult;
    }

    public void setFirstShootingRange(String firstShootingRange) {
        this.firstShootingRange = firstShootingRange;
    }

    public void setSecondShootingRange(String secondShootingRange) {
        this.secondShootingRange = secondShootingRange;
    }

    public void setThirdShootingRange(String thirdShootingRange) {
        this.thirdShootingRange = thirdShootingRange;
    }

    public int setPenaltyInSeconds() {
        String stringForPenalty = this.firstShootingRange + this.secondShootingRange + this.thirdShootingRange;
        Character chCheck = 'o';
        for (int i = 0; i < stringForPenalty.length(); i++) {
            if (chCheck.equals(stringForPenalty.charAt(i))) {
                this.penaltyInSeconds += 10;
            }
        }
        return this.penaltyInSeconds;
    }

    public int setFinalResultInSeconds() {
        String stringElements[] = this.skyTimeResult.split(":");
        this.finalResultInSeconds = (Integer.parseInt(stringElements[0]) * 60) + Integer.parseInt(stringElements[1]) + this.penaltyInSeconds;
        return this.finalResultInSeconds;
    }


    public String getAthleteNumber() {
        return athleteNumber;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getSkyTimeResult() {
        return skyTimeResult;
    }

    public String getFirstShootingRange() {
        return firstShootingRange;
    }

    public String getSecondShootingRange() {
        return secondShootingRange;
    }

    public String getThirdShootingRange() {
        return thirdShootingRange;
    }

    public int getFinalResultInSeconds() {
        return finalResultInSeconds;
    }

    public int getPenaltyInSeconds() {
        return penaltyInSeconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Result)) return false;
        Result result = (Result) o;
        return getFinalResultInSeconds() == result.getFinalResultInSeconds() && getPenaltyInSeconds() == result.getPenaltyInSeconds() && Objects.equals(getAthleteNumber(), result.getAthleteNumber()) && Objects.equals(getAthleteName(), result.getAthleteName()) && Objects.equals(getCountryCode(), result.getCountryCode()) && Objects.equals(getSkyTimeResult(), result.getSkyTimeResult()) && Objects.equals(getFirstShootingRange(), result.getFirstShootingRange()) && Objects.equals(getSecondShootingRange(), result.getSecondShootingRange()) && Objects.equals(getThirdShootingRange(), result.getThirdShootingRange());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAthleteNumber(), getAthleteName(), getCountryCode(), getSkyTimeResult(), getFirstShootingRange(), getSecondShootingRange(), getThirdShootingRange(), getFinalResultInSeconds(), getPenaltyInSeconds());
    }

    @Override
    public int compareTo(Result o) {
        return this.getFinalResultInSeconds() - o.getFinalResultInSeconds();
    }

    @Override
    public String toString() {
        return athleteName + " " + skyTimeResult + " ( " + skyTimeResult + " + " + penaltyInSeconds + ")\n";
    }
}
