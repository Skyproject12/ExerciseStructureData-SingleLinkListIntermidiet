package com.company;

public interface SLLInterface<T>{
        public void fist(T data);
    public void last(T data);
    public void remove(T data);
    public void middle (T data);
    public void Skip (T data);
    public int getPositionAt(String data);
    public int getCurrentSize ();
    public  boolean isEmpety ();
    void tampil();
}