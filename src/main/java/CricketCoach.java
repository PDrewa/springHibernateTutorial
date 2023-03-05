public class CricketCoach implements Coach {
    private FortuneService fortuneService;


    @Override
    public String getDailyWorkout() {
        return "Practice cricket";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
