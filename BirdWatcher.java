
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay.clone();
    }

    public int getToday() {
        int[] getTodayCount=getLastWeek();
        return getTodayCount[getTodayCount.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
           for(int i=0;i<birdsPerDay.length;i++){
               if(birdsPerDay[i]==0)
                    return true;
           }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum=0;
        if(numberOfDays>birdsPerDay.length-1){
            for(int i=0;i<birdsPerDay.length;i++){
            sum+=birdsPerDay[i];
        }
        }
        else{
        for(int i=0;i<numberOfDays;i++){
            sum+=birdsPerDay[i];
        }
            }
        return sum;
    }

    public int getBusyDays() {
        int count=0;
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i]>=5){
                count++;
            }
        }
        return count;
    }
}
