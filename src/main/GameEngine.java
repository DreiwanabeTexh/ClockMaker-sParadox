package src.main;
import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.*;
import src.entity.Player;
import src.scene.Scene;
import src.scene.SceneLoader;
import src.ui.TextDisplayer;

public class GameEngine extends TextDisplayer {

    private Player player = new Player();
    private int currentScene = 1;
    private Scanner input = new Scanner(System.in);
    private Clip backgroundMusic;
    private boolean musicEnabled = true;
    private final int TOTAL_SCENES = 30;

    // Music control methods
    private void playBackgroundMusic() {
        if (!musicEnabled) return;
        
        try {
            File musicFile = new File("bg.wav");
            
            if (musicFile.exists()) {
                AudioInputStream originalAudio = AudioSystem.getAudioInputStream(musicFile);
                AudioFormat originalFormat = originalAudio.getFormat();
                System.out.println("File exists: " + musicFile.exists());
                
                // Create a compatible target format (16-bit PCM)
                AudioFormat targetFormat = new AudioFormat(
                    AudioFormat.Encoding.PCM_SIGNED,
                    originalFormat.getSampleRate(),
                    16,
                    originalFormat.getChannels(),
                    originalFormat.getChannels() * 2,
                    originalFormat.getSampleRate(),
                    false
                    
                );
                
                // Convert audio stream if formats don't match
                AudioInputStream audioInput = originalAudio;
                if (!originalFormat.matches(targetFormat)) {
                    if (AudioSystem.isConversionSupported(targetFormat, originalFormat)) {
                        audioInput = AudioSystem.getAudioInputStream(targetFormat, originalAudio);
                    }
                }
                
                backgroundMusic = AudioSystem.getClip();
                backgroundMusic.open(audioInput);
                
                // Set volume to 50%
                FloatControl gainControl = (FloatControl) backgroundMusic.getControl(FloatControl.Type.MASTER_GAIN);
                float range = gainControl.getMaximum() - gainControl.getMinimum();
                float gain = (range * 0.7f) + gainControl.getMinimum();
                gainControl.setValue(gain);
                
                backgroundMusic.loop(Clip.LOOP_CONTINUOUSLY);
                backgroundMusic.start();
                slowType("Ambient music begins to play...");
                
                originalAudio.close();
            } else {
                normalType("(Music file not found - continuing without background music)");
            }
        } catch (Exception e) {
            normalType("(Background music unavailable - " + e.getMessage() + ")");
        } 
    }

    private void stopBackgroundMusic() {
        if (backgroundMusic != null && backgroundMusic.isRunning()) {
            backgroundMusic.stop();
            backgroundMusic.close();
        }
    }

    private void pauseBackgroundMusic() {
        if (backgroundMusic != null && backgroundMusic.isRunning()) {
            backgroundMusic.stop();
        }
    }

    private void resumeBackgroundMusic() {
        if (backgroundMusic != null && !backgroundMusic.isRunning()) {
            backgroundMusic.start();
        }
    }

    public void toggleMusic() {
        musicEnabled = !musicEnabled;
        if (musicEnabled) {
            resumeBackgroundMusic();
            normalType("Music enabled");
        } else {
            pauseBackgroundMusic();
            normalType("Music disabled");
        }
    }

    private void contextTransition(int sceneNumber) {
        if (sceneNumber % 5 == 0) {
            pauseBackgroundMusic();
        }

        switch (sceneNumber) {
            case 2:
                slowType("\nThe walls rumble...\nA cold breeze brushes your neck...\nYou feel the world shifting again.\n");
                break;
            case 3:
                slowType("\nYour vision blurs...\nWhispers slither into your ears...\nSomething pulls you deeper.\n");
                break;
            case 4:
                slowType("\nThe ground dissolves beneath you...\nGlass shatters in the distance...\nA maze forms around your mind.\n");
                break;
            case 5:
                slowType("\nSmoke rises from the cracks...\nFootsteps echo behind you...\nTime feels heavier.\n");
                break;
            case 6:
                slowType("\nA metal clang echoes...\nGears turn somewhere in the dark...\nFrost kisses your fingertips.\n");
                break;
            case 7:
                slowType("\nShadows freeze mid-movement...\nMemories flicker like broken film...\nSomething watches from behind.\n");
                break;
            case 8:
                slowType("\nA pendulum swings in your head...\nLeft, right, left...\nYour heartbeat syncs unwillingly.\n");
                break;
            case 9:
                slowType("\nA deep voice murmurs...\nToo close... too familiar...\nReality bends at the edges.\n");
                break;
            case 10:
                slowType("\nWater chills your ankles...\nDrip... drip... drip...\nThe corridor stretches endlessly.\n");
                break;
            case 11:
                slowType("\nHands scrape against the walls...\nSoft, pleading...\nThey want help-or company.\n");
                break;
            case 12:
                slowType("\nMetallic scents fill your nose...\nBroken clocks tick in irregular rhythms...\nA workshop breathes around you.\n");
                break;
            case 13:
                slowType("\nYour shadow grows longer...\nThen splits...\nThen smiles.\n");
                break;
            case 14:
                slowType("\nA door pulses like a heartbeat...\nThe air grows warm and wet...\nSomething behind it whispers your name.\n");
                break;
            case 15:
                slowType("\nA golden mask flashes...\nYour memories pound like a hammer...\nThe Clockmaker is close.\n");
                break;
            case 16:
                slowType("\nFrost coats your eyelashes...\nYour breath paints words in the air...\nThis place remembers your sins.\n");
                break;
            case 17:
                slowType("\nGlass spheres clink softly...\nEchoing memories swirl around you...\nSome beg to be touched.\n");
                break;
            case 18:
                slowType("\nA giant pendulum hums...\nEach swing threatens your existence...\nTiming becomes your lifeline.\n");
                break;
            case 19:
                slowType("\nVoices overlap...\nPast, present, future...\nAll debating your fate.\n");
                break;
            case 20:
                slowType("\nWater floods around your knees...\nYour reflection cries in the walls...\nYou step forward anyway.\n");
                break;
            case 21:
                slowType("\nHands reach through darkness...\nSoft. Cold. Desperate...\nThey pull at your conscience.\n");
                break;
            case 22:
                slowType("\nTools rattle on their own...\nClocks unwind backwards...\nA journal flips open to your name.\n");
                break;
            case 23:
                slowType("\nYour shadow rises without you...\nIt speaks your secrets...\nOnes you never told anyone.\n");
                break;
            case 24:
                slowType("\nA living door breathes slowly...\nEach inhale pulls you closer...\nTruth pulses behind its skin.\n");
                break;
            case 25:
                slowType("\nA cracked golden mask turns toward you...\nThe Clockmaker waits...\nYour past stands behind him.\n");
                break;
            case 26:
                slowType("\nA massive heart beats...\nTick. Thump. Tick.\nYour pulse matches its rhythm.\n");
                break;
            case 27:
                slowType("\nEverything fades to white...\nEven your thoughts...\nA final question forms.\n");
                break;
            case 28:
                slowType("\nThe timeline collapses...\nMoments repeat, overlap, twist...\nYou stand in the center of the paradox.\n");
                break;
            case 29:
                slowType("\nA beeping pierces the silence...\nA bed creaks...\nLight pours in from somewhere real.\n");
                break;
            case 30:
                slowType("\nThe ticking stops...\nThe world grows quiet...\nYour journey is about to end.\n");
                break;
            default:
                slowType("\nTime stutters...\nReality rearranges itself...\n");
                break;
        }
    }

    public void start() {
        playBackgroundMusic();
        
        slowType("=== THE CLOCKMAKER'S PARADOX ===");
        System.out.println("---------------------------------------------------\n");

        slowType("Rain. Screeching tires. A flash of headlights.\nThen-impact.\nBefore everything went silent, you saw a broken watch on the road,\n" + 
                        "its hands ticking backward.\nNow you wake in a place that isn't home-cold walls, distant whispers,\nshadows that wait.\n" + 
                        "A voice echoes in your mind:\n" + 
                        "   \"Every mistake costs time.\n    Every truth returns it.\"\n" + 
                        "Somewhere, your real body lies motionless.\nHere, you must find the truth-or repeat the loop forever.\n");


        normalType("You have 10 days. Every wrong decision costs one.");
        normalType("Type 'music' at any time to toggle background music");
        System.out.println("---------------------------------------------------\n");

        while (player.isAlive() && currentScene <= TOTAL_SCENES) {
            if (currentScene > 1) {
                contextTransition(currentScene);
            }

            Scene scene = SceneLoader.getScene(currentScene);
            slowType("\n" + scene.getTitle());
            normalType(scene.getDescription());

            for (int i = 0; i < scene.getChoices().size(); i++) {
                System.out.println((i + 1) + ". " + scene.getChoices().get(i).getDescription());
            }

            System.out.print("\nEnter choice (1-3) or 'music': ");
            String userInput = input.nextLine().trim();

            if (userInput.equalsIgnoreCase("music")) {
                toggleMusic();
                continue;
            }

            int choiceIndex;
            try {
                choiceIndex = Integer.parseInt(userInput) - 1;
            } catch (NumberFormatException e) {
                normalType("Invalid input. Please enter 1, 2, 3, or 'music'.");
                continue;
            }

            if (choiceIndex < 0 || choiceIndex > 2) {
                normalType("Invalid choice. Time punishes you. -1 day.");
                player.loseDay();
                System.out.println("Days left: " + player.getDaysLeft());
                continue;
            }

            Choice chosen = scene.getChoices().get(choiceIndex);
            System.out.println();
            normalType(chosen.getConsequence());

            if (chosen.isCorrect()) {
                currentScene++;
            } else {
                player.loseDay();
                System.out.println("Days left: " + player.getDaysLeft());
                
                if (currentScene >= 1 && currentScene <= 5) {
                    // Scene 1-5: -1 life and go back to scene 1
                    currentScene = 1;
                    slowType("\nTime warps violently! You're thrown back to the very beginning...");
                } else if (currentScene >= 6 && currentScene <= 30) {
                    // Scene 6-30: -1 life and go back 5 scenes
                    currentScene = Math.max(1, currentScene - 5);
                    slowType("\nThe timeline unravels! You're pulled back 5 scenes...");
                }
                
                pauseBackgroundMusic();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                if (musicEnabled) resumeBackgroundMusic();
            }
        }

        stopBackgroundMusic();

        if (!player.isAlive()) {
            dramaticType("\nYour final day ends...");
            normalType("Time collapses.\nThe Clockmaker takes your last breath.");
        } else {
            dramaticType("\nYou have completed the journey through all 30 scenes...");
            slowType("The Clockmaker's paradox has been resolved.");
            normalType("Time itself bows to your perseverance and wisdom.");
        }
        
        slowType("\nThank you for playing THE CLOCKMAKER'S PARADOX");
    }

    public void cleanup() {
        stopBackgroundMusic();
        input.close();
    }
}