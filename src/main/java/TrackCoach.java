public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Track Coach";
    }


    @Override
    public String getDailyFortune() {
        return "Track coach: " + fortuneService.getFortune();
    }


}
