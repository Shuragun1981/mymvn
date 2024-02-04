public class BonusService {
    public long calculate(long amount, boolean Registered) {
        int percent = Registered ? 3 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
