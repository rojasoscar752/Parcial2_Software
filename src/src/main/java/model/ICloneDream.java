package model;

public interface ICloneDream<T extends ICloneDream> extends Cloneable{
    public T clone();
    public T reset();
}
