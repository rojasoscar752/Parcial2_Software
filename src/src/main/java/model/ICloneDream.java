package model;

public interface ICloneDream<T extends ICloneDream> extends Cloneable{
    public T cloneDream();
    public T resetDream();
}
