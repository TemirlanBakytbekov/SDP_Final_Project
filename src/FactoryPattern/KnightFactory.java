package FactoryPattern;
import ObserverPattern.Character;
import ObserverPattern.Knight;

public class KnightFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Knight();
    }
}