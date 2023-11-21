package FactoryPattern;
import ObserverPattern.Character;
import ObserverPattern.HandFighter;
public class HandFighterFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new HandFighter();
    }
}