class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
      /*boolean conditionWithDog = !archerIsAwake && petDogIsPresent;

        boolean conditionWithoutDog = !archerIsAwake && !knightIsAwake && prisonerIsAwake && !petDogIsPresent;

        return conditionWithDog || conditionWithoutDog; */

        if(archerIsAwake){
            return false;
        }

        if(petDogIsPresent){
            return true;
        }
        return !knightIsAwake && prisonerIsAwake;
    }
}
