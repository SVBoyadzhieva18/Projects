import java.util.ArrayList;
import java.util.List;

class Bakery {
    private List<PastryBaker> pastryBakers;

    public Bakery() {
        pastryBakers = new ArrayList<>();
    }

    public void addPastryBaker(PastryBaker pastryBaker) {
        pastryBakers.add(pastryBaker);
    }

    public List<PastryBaker> getAllPastries() {
        return pastryBakers;
    }

    public List<PastryBaker> getPastriesByBakerId(int bakerId) {
        List<PastryBaker> pastriesByBakerId = new ArrayList<>();
        for (PastryBaker pastryBaker : pastryBakers) {
            if (pastryBaker.getBaker().getBakerId() == bakerId) {
                pastriesByBakerId.add(pastryBaker);
            }
        }
        return pastriesByBakerId;
    }

    public void addPastryToBaker(Pastry pastry, Baker baker) {
        PastryBaker pastryBaker = new PastryBaker(pastry, baker);
        pastryBakers.add(pastryBaker);
    }

    public void removePastryFromBaker(int pastryId, int bakerId) {
        PastryBaker pastryToRemove = null;
        for (PastryBaker pastryBaker : pastryBakers) {
            if (pastryBaker.getPastry().getPastryId() == pastryId && pastryBaker.getBaker().getBakerId() == bakerId) {
                pastryToRemove = pastryBaker;
                break;
            }
        }
        if (pastryToRemove != null) {
            pastryBakers.remove(pastryToRemove);
        }
    }
}