public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Just do something";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
