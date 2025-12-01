package src.scene;

import java.util.ArrayList;
import java.util.List;
import src.main.Choice;

public class SceneLoader {

    public static Scene getScene(int id) {
        switch (id) {
            case 1: return scene1();
            case 2: return scene2();
            case 3: return scene3();
            case 4: return scene4();
            case 5: return scene5();
            case 6: return scene6();
            case 7: return scene7();
            case 8: return scene8();
            case 9: return scene9();
            case 10: return scene10();
            case 11: return scene11();
            case 12: return scene12();
            case 13: return scene13();
            case 14: return scene14();
            case 15: return scene15();
            case 16: return scene16();
            case 17: return scene17();
            case 18: return scene18();
            case 19: return scene19();
            case 20: return scene20();
            case 21: return scene21();
            case 22: return scene22();
            case 23: return scene23();
            case 24: return scene24();
            case 25: return scene25();
            case 26: return scene26();
            case 27: return scene27();
            case 28: return scene28();
            case 29: return scene29();
            case 30: return scene30();
            default: return createTestScene("Scene " + id, "This is scene " + id);
        }
    }

    // SCENE 1-22 (your existing scenes remain the same)
    private static Scene scene1() {
        String title = "Scene 1 — The Room of Echoes";
        String description = "You awaken in a dim cell. A lamp, a mirror, and a wooden door stand before you.\nWhispers curl along the walls: 'Time forgets the careless.'";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Smash the lamp.", false, "Darkness floods in. A whisper screams. You lose a day."));
        choices.add(new Choice("Kick the door.", false, "A shriek answers your aggression. The world resets violently."));
        choices.add(new Choice("Look into the mirror.", true, "Your reflection distorts, revealing a hidden fear inside you..."));

        return new Scene(title, description, choices);
    }

    private static Scene scene2() {
        String title = "Scene 2 — The Hall of Whispers";
        String description = "A corridor stretches forward, lined with six clocks ticking at different speeds.\nAt the end is a door labeled: SILENCE.";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Walk straight to the SILENCE door.", false, "The noise triggers an alarm. The hallway resets."));
        choices.add(new Choice("Listen closely to each clock.", true, "Only one clock ticks forward. You follow it to the next room."));
        choices.add(new Choice("Break all the clocks.", false, "Time screams in pain. You lose a day."));

        return new Scene(title, description, choices);
    }

    private static Scene scene3() {
        String title = "Scene 3 — The Librarian";
        String description = "A tall eyeless figure sorts ancient books.\n'Each truth saves you time,' he whispers. 'Each lie steals it.'";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Tell him you know who you are.", false, "A lie. Clocks tick faster. You lose a day."));
        choices.add(new Choice("Stay silent.", false, "He loses patience. Your form begins dissolving."));
        choices.add(new Choice("Tell him you remember nothing.", true, "He nods. A page from the Clockmaker's Journal appears in your hand."));

        return new Scene(title, description, choices);
    }

    private static Scene scene4() {
        String title = "Scene 4 — The Mirror Maze";
        String description = "You're surrounded by endless mirrors.\nOne reflection smiles. One cries. One stares with hatred.";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Follow the crying reflection.", true, "It leads you to an exit mirror holding a silver key."));
        choices.add(new Choice("Smash all the mirrors.", false, "Your reflections multiply in anger. Reset."));
        choices.add(new Choice("Follow the smiling reflection.", false, "It guides you to a false exit. You die instantly."));

        return new Scene(title, description, choices);
    }

    private static Scene scene5() {
        String title = "Scene 5 — The Staircase of Smoke";
        String description = "An endless spiral staircase stretches upward.\nEvery step creaks, echoing through the smoke-filled air.";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Count your steps carefully.", true, "Step 13 repeats. You find a hidden door behind the illusion."));
        choices.add(new Choice("Run up the staircase.", false, "You fall endlessly through time. Lose a day."));
        choices.add(new Choice("Sit and wait.", false, "Smoke fills your lungs. You fade out."));

        return new Scene(title, description, choices);
    }

    private static Scene scene6() {
        String title = "Scene 6 — The Children's Room";
        String description = "A toy clock ticks beside a doll with missing eyes.\nCrayon scribbles on the wall read: 'Mommy said don't touch time.'";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Smash the toy clock.", false, "Time bleeds into the floor. You lose a day."));
        choices.add(new Choice("Fix the doll's eyes.", true, "Compassion unlocks a memory: a faint image of a hospital room."));
        choices.add(new Choice("Burn the doll.", false, "It screams with a child's voice. Reset."));

        return new Scene(title, description, choices);
    }

    private static Scene scene7() {
        String title = "Scene 7 — The Elevator of Emotions";
        String description = "An old elevator waits. Its buttons read: FEAR, HOPE, ANGER, CALM.";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Press HOPE.", false, "The elevator plummets endlessly. Lose a day."));
        choices.add(new Choice("Press FEAR.", false, "Darkness engulfs you. Reset."));
        choices.add(new Choice("Press CALM.", true, "The elevator rises smoothly into silence."));

        return new Scene(title, description, choices);
    }

    private static Scene scene8() {
        String title = "Scene 8 — The Painter's Studio";
        String description = "Canvases fill the room — each showing a person screaming silently.\nOne unfinished painting resembles you.";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Finish painting your own eyes.", true, "Your self-image sharpens. A door reveals itself."));
        choices.add(new Choice("Destroy the canvases.", false, "Your face erases from the world. Reset."));
        choices.add(new Choice("Paint over the Clockmaker's mask.", false, "His laughter echoes. Lose a day."));

        return new Scene(title, description, choices);
    }

    private static Scene scene9() {
        String title = "Scene 9 — The Clockwork Bridge";
        String description = "A narrow bridge hangs over grinding gears.\nA voice warns: 'Wrong step, wrong fate.'";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Run across quickly.", false, "You slip and fall into the gears."));
        choices.add(new Choice("Step only on gears turning clockwise.", true, "Your path holds. You reach the other side."));
        choices.add(new Choice("Jump off intentionally.", false, "Instant death."));

        return new Scene(title, description, choices);
    }

    private static Scene scene10() {
        String title = "Scene 10 — The Calendar Room";
        String description = "Every wall is covered with thousands of dates.\nOne date glows faintly: June 9.";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Touch today's date.", false, "'You don't exist today,' a voice whispers. Reset."));
        choices.add(new Choice("Touch June 9.", true, "A flashback hits you — hospital lights, sirens..."));
        choices.add(new Choice("Tear the calendars down.", false, "Time collapses around you. Lose a day."));

        return new Scene(title, description, choices);
    }

    private static Scene scene11() {
        String title = "Scene 11 — The Hospital Corridor";
        String description = "A flickering hallway unfolds.\nThrough a window, you see your own body lying motionless on a bed.";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Bang on the window.", false, "Your body flatlines. Lose a day."));
        choices.add(new Choice("Run away.", false, "The corridor loops back to the start. Reset."));
        choices.add(new Choice("Watch quietly.", true, "You gain clarity — a memory of the accident surfaces."));

        return new Scene(title, description, choices);
    }

    private static Scene scene12() {
        String title = "Scene 12 — The Nurse's Voice";
        String description = "You hear a warm but unsettling voice whisper:\n'Stay asleep... you're safe here.'";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Follow the voice.", false, "It fades into static. You vanish. Reset."));
        choices.add(new Choice("Scream for help.", false, "Your voice distorts into nothing. Lose a day."));
        choices.add(new Choice("Listen calmly.", true, "You hear hidden words beneath her tone — a clue about your accident."));

        return new Scene(title, description, choices);
    }

    private static Scene scene13() {
        String title = "Scene 13 — The Garden of Rot";
        String description = "Dead plants surround you. Sundials lie broken.\nOnly a single black rose blooms in the center.";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Pick the rose.", false, "Thorns pierce your skin. Reset."));
        choices.add(new Choice("Water the black rose.", true, "Life returns to it. A hidden door opens."));
        choices.add(new Choice("Burn the rose.", false, "Smoke blinds you. Lose a day."));

        return new Scene(title, description, choices);
    }

    private static Scene scene14() {
        String title = "Scene 14 — The Soundless Clock";
        String description = "A giant clock stands silent.\nIts inscription reads: 'To move forward, you must stop listening.'";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Cover your ears and wait.", true, "The clock begins to move. A path opens."));
        choices.add(new Choice("Hit the clock.", false, "Gears explode outward. Reset."));
        choices.add(new Choice("Scream at the clock.", false, "Your voice rebounds painfully. Lose a day."));

        return new Scene(title, description, choices);
    }

    private static Scene scene15() {
        String title = "Scene 15 — The Hidden Diary";
        String description = "A chest labeled 'DAY 0' sits alone.\nIt vibrates softly, as if something inside is alive.";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Use the silver key from earlier.", true, "The lock clicks open. You recover a crucial memory."));
        choices.add(new Choice("Break the chest open.", false, "Something screams inside. Reset."));
        choices.add(new Choice("Ignore the chest.", false, "You feel truth slipping away. Lose a day."));

        return new Scene(title, description, choices);
    }

    private static Scene scene16() {
        String title = "Scene 16 — The Frozen Hall";
        String description = "Frost coats every wall. Your breath forms words:\n'You left them behind.'";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Open the red door.", false, "Flames burst out. Lose a day."));
        choices.add(new Choice("Open the blue door.", true, "Cold air guides you into the Memory Vault."));
        choices.add(new Choice("Open the white door.", false, "You fade into endless snow. Reset."));

        return new Scene(title, description, choices);
    }

    private static Scene scene17() {
        String title = "Scene 17 — The Memory Vault";
        String description = "Shelves of glowing glass spheres fill the room.\nEach one contains a memory you lost.";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Smash all the spheres.", false, "Memories scatter like dust. Lose a day."));
        choices.add(new Choice("Flee the vault.", false, "The door seals behind you. Reset."));
        choices.add(new Choice("Touch the sphere labeled 'Day 0'.", true, "A surge of truth hits you — the accident returns to your mind."));

        return new Scene(title, description, choices);
    }

    private static Scene scene18() {
        String title = "Scene 18 — The Pendulum Chamber";
        String description = "A massive pendulum swings above a pit of gears.\nA warning is carved: 'Truth lies between movement and stillness.'";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Dash across immediately.", false, "The pendulum slices through you. Lose a day."));
        choices.add(new Choice("Wait for the pendulum to slow, then cross.", true, "You move precisely at the safe moment."));
        choices.add(new Choice("Try to stop the pendulum.", false, "It crushes you instantly. Reset."));

        return new Scene(title, description, choices);
    }

    private static Scene scene19() {
        String title = "Scene 19 — The Clockmaker's Voice";
        String description = "Three clocks appear: PAST, PRESENT, FUTURE.\nThe Clockmaker whispers: 'Choose wisely.'";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Turn the PRESENT clock.", true, "The gears hum softly. 'You finally understand,' he says."));
        choices.add(new Choice("Turn the PAST clock.", false, "The world rewinds painfully. Lose a day."));
        choices.add(new Choice("Turn the FUTURE clock.", false, "It vanishes from existence. Reset."));

        return new Scene(title, description, choices);
    }

    private static Scene scene20() {
        String title = "Scene 20 — The Flooded Corridor";
        String description = "Cold water rises around your legs.\nReflections of your family ripple across the walls.";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Wade slowly while following the reflections.", true, "You find the hidden stairway out."));
        choices.add(new Choice("Run as fast as you can.", false, "You slip beneath the water. Lose a day."));
        choices.add(new Choice("Call out to the reflections.", false, "They scream back at you. Reset."));

        return new Scene(title, description, choices);
    }

    private static Scene scene21() { 
        String title = "Scene 21 — The Tower of Hands";
        String description = "Hundreds of hands reach from the walls — pale, searching, trembling.\nWhispers: 'Help us... or join us'";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Slap them away.", false, "They multiply and pull you deeper."));
        choices.add(new Choice("Hold one hand gently.", true, "Compassion test — a hand gives you a broken watch piece."));
        choices.add(new Choice("Ignore them.", false, "They tear your reflection apart."));

        return new Scene(title, description, choices);
    }

    private static Scene scene22() { 
        String title = "Scene 22 — The Mechanist's Workshop";
        String description = "Tables covered in gears, clocks, broken hearts made of glass.\nA journal lies open: 'He built her a time that never healed.'";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Assemble the broken watch using the piece you found.", true, "Restores a hidden memory."));
        choices.add(new Choice("Throw the watch away.", false, "'You learned nothing.' Reset."));
        choices.add(new Choice("Break everything.", false, "The world shakes violently. Lose 2 days."));

        return new Scene(title, description, choices);
    }

    // SCENE 23-30 (using your implementations)
    private static Scene scene23() {
        String title = "Scene 23 — The Shadow Hour";
        String description = "The entire world turns dark except for one glowing clock at 12:00.\nA shadowy version of you steps out, smiling.";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Run.", false, "The darkness swallows you whole."));
        choices.add(new Choice("Fight it.", false, "It mirrors your every move -- you destroy yourself."));
        choices.add(new Choice("Listen to what the shadow says.", true, "It confesses: \"You caused the accident.\" Facing truth = +insight."));

        return new Scene(title, description, choices);
    }

    private static Scene scene24() {
        String title = "Scene 24 — The Breathing Door";
        String description = "You find a door made of flesh and gears. It moves like it's alive.\nA voice behind it says: \"The truth is ugly. Will you open me?\"";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Turn back.", false, "Cowardice costs 3 days."));
        choices.add(new Choice("Open it anyway.", true, "Logic and courage -- you see the hospital room and the real Clockmaker watching you."));
        choices.add(new Choice("Burn it.", false, "Fire feeds it -- you suffocate."));

        return new Scene(title, description, choices);
    }

    private static Scene scene25() {
        String title = "Scene 25 — The Clockmaker's Table";
        String description = "You stand before him -- pale, dressed in black, face hidden by a cracked golden mask.\nHe's building a clock out of your memories.\n\"You created me to make sense of your guilt.\"";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Admit your fault.", true, "\"Then you are ready,\" he says, handing you the final gear."));
        choices.add(new Choice("Attack him.", false, "He crushes you with gears."));
        choices.add(new Choice("Deny everything.", false, "The mask laughs -- time rewinds to Scene 1."));

        return new Scene(title, description, choices);
    }

    private static Scene scene26() {
        String title = "Scene 26 — The Heart Clock";
        String description = "You stand before a massive heart-shaped clock. It ticks with your pulse.\nThe final gear fits perfectly -- but the hands are reversed.";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Leave it.", false, "Time stops -- eternal limbo."));
        choices.add(new Choice("Reverse the hands manually.", true, "Heartbeats synchronize -- flashback shows forgiveness."));
        choices.add(new Choice("Smash the clock.", false, "You die instantly."));

        return new Scene(title, description, choices);
    }

    private static Scene scene27() {
        String title = "Scene 27 — The White Void";
        String description = "Silence. The world dissolves. You see only the Clockmaker and yourself.\n\"One last question,\" he says, \"Would you relive it all to make it right?\"";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Say \"Yes.\"", true, "Acceptance ending -- leads to final truth."));
        choices.add(new Choice("Say \"No.\"", false, "Refusal -- permanent coma."));
        choices.add(new Choice("Stay silent.", false, "The void consumes you."));

        return new Scene(title, description, choices);
    }

    private static Scene scene28() {
        String title = "Scene 28 — The Final Paradox";
        String description = "You see flashes of all previous scenes, merging.\nEvery choice, every mistake, every truth overlaps.\nA voice whispers: \"Was it all a loop... or a lesson?\"";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Wait for rescue.", false, "Time ends"));
        choices.add(new Choice("Try to run back.", false, "Infinite regress -- trapped in thought."));
        choices.add(new Choice("Step forward into the collapsing timeline.", true, "The loop begins to unravel -- enlightenment achieved."));

        return new Scene(title, description, choices);
    }

    private static Scene scene29() {
        String title = "Scene 29 — The Awakening";
        String description = "You hear a beeping sound. White lights.\nThe voice of a nurse: \"He's waking up.\"\nYou realize -- it was all your coma mind's test to accept what you did.";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Keep them closed.", false, "Permanent sleep."));
        choices.add(new Choice("Open your eyes.", true, "You wake, whispering \"The Clockmaker was me.\""));
        choices.add(new Choice("Panic.", false, "Heart monitor flatlines."));

        return new Scene(title, description, choices);
    }

    private static Scene scene30() {
        String title = "Scene 30 — The 100th Chime (Final Scene)";
        String description = "Back in your hospital room, a broken watch rests beside you.\nThe ticking has stopped. You smile faintly -- the Clockmaker's voice echoes one last time:\n\n\"Time fixed you… because you chose to fix yourself.\"";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Leave it.", false, "Time stops -- eternal limbo."));
        choices.add(new Choice("Reverse the hands manually.", true, "Heartbeats synchronize -- flashback shows forgiveness."));
        choices.add(new Choice("Smash the clock.", false, "You die instantly."));

        return new Scene(title, description, choices);
    }

    private static Scene createTestScene(String title, String description) {
        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Choice 1 - Correct", true, "Correct! Moving to next scene."));
        choices.add(new Choice("Choice 2 - Wrong", false, "Wrong! You lose a day."));
        choices.add(new Choice("Choice 3 - Wrong", false, "Wrong! You lose a day."));
        return new Scene(title, description, choices);
    }
}