public class FitnessInstructor implements Coach {
    private FortuneService fortuneService;

    public FitnessInstructor(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "I'm FitnessInstructor";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
