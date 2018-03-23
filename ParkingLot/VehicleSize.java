public enum VehicleSize{
    Compact(1), Large(2); //, Regular
    private final int size;
    VehicleSize(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }
}
