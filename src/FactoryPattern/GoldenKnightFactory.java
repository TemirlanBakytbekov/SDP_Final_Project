package FactoryPattern;
import ObserverPattern.Character;
import ObserverPattern.GoldenKnight;

public class GoldenKnightFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new GoldenKnight();
    }
}
