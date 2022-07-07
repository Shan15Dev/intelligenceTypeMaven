package ch.bbw.intelligencetypemaven.data;

import ch.bbw.intelligencetypemaven.model.Answer;
import ch.bbw.intelligencetypemaven.model.Questions;

import java.util.ArrayList;

public class AllQuestions {
    private Questions q1 = new Questions("1. Kannst du gut mit Zahlen umgehen?",
            new Answer(
                    new String[] { "Ich kann gut mit Geld umgehen.", "Ich bin ein Zahlen-Typ.",
                            "Mathe ist nicht meine Stärke.", "Ich kann besser mit Worten umgehen" },
                    new String[] { "intrapersonal", "mathematical", "bodily", "linguistic" }));

    private Questions q2 = new Questions("2. Welches der vier Elemente hälts du für das mächtigste?",
            new Answer(new String[] { "Luft", "Wasser", "Feuer", "Erde" },
                    new String[] { "musical", "naturally", "bodily", "spatial" }));

    private Questions q3 = new Questions("3. Wie würdest du diesen Satz beenden? Ich_______ Hund.",
            new Answer(new String[] { "träumte von einem", "hätte gerne ein", "sah nie ein", "war einmal ein" },
                    new String[] { "spatial", "bodily", "intrapersonal", "interpersonal" }));

    private Questions q4 = new Questions("4. Wie fit bist du körperlich?",
            new Answer(
                    new String[] { "Ich bin ziemlich fit.", "Ich komme täglich besser in Form.", "Ich bin in Topform.",
                            "Ich könnte noch ein paar Runden drehen. " },
                    new String[] { "intrapersonal", "interpersonal", "spatial", "linguistic" }));

    private Questions q5 = new Questions("5. Ich welchem Fach hast du dich in der Schule hervorgetan?",
            new Answer(new String[] { "Geschichte", "Naturwissenschaften", "Mathematik", "Deutsch" },
                    new String[] { "interpersonal", "naturally", "mathematical", "linguistic" }));

    private Questions q6 = new Questions("6. Was machst du auf Parties?",
            new Answer(new String[] { "Mit Freunden tanzen", "Singen", "Mit Mädchen flirten", "Trinken" },
                    new String[] { "bodily", "musical", "interpersonal", "intrapersonal" }));

    private Questions q7 = new Questions("7. Wie bereitest du dich auf eine Prüfung vor?",
            new Answer(
                    new String[] { "Ich höre Musik während ich lerne", "Ich arbeite mit meinen Mitschülern zusammen",
                            "Ich mache beim Lernen Pausen", "Ich mache mir eine Mindmap" },
                    new String[] { "musical", "interpersonal", "intrapersonal", "linguistic" }));

    private Questions q8 = new Questions("8. Was machst du in deiner Freizeit?",
            new Answer(new String[] { "Sport", "Lesen", "Gaming", "Zeichnen" },
                    new String[] { "bodily", "linguistic", "intrapersonal", "spatial" }));

    private Questions q9 = new Questions("9. Was für einen Kurs würdest du mit einem Kollegen belegen?",
            new Answer(new String[] { "Selbstverteidigung", "Yoga", "Finanzverwaltung", "Kräuterheilkunde" },
                    new String[] { "bodily", "intrapersonal", "mathematical", "naturally" }));

    private Questions q10 = new Questions("10. Was wäre dein Job in einem Lebensmittelgeschäft?",
            new Answer(
                    new String[] { "Begrüsser", "Warenauffüller", "Manager",
                            "Verkaufshilfe für landwirtl. Erzeugnisse" },
                    new String[] { "linguistic", "bodily", "interpersonal", "naturally" }));

    private Questions q11 = new Questions("11. Welches Fabelwesen magst du am liebsten?",
            new Answer(new String[] { "Sirene", "Meerjungfrau", "Einhorn", "Drache" },
                    new String[] { "musical", "spatial", "linguistic", "bodily" }));

    private Questions q12 = new Questions("12. Welchem biblischen Charakater ähnelst du am ehesten?",
            new Answer(new String[] { "Engel", "Teufel", "Dämon", "Heiliger Geist" },
                    new String[] { "linguistic", "intrapersonal", "bodily", "interpersonal" }));

    private Questions q13 = new Questions("13. Bei welcher Serie würdest du am ehesten einen Fernsehmarathon einlegen?",
            new Answer(
                    new String[] { "Game of Thrones", "The Walking Dead", "The Big Bang Theory", "Last Man on Earth" },
                    new String[] { "bodily", "intrapersonal", "mathematical", "spatial" }));

    private Questions q14 = new Questions("14. Was gibt dir das Gefühl, etwas erreicht zu haben?",
            new Answer(
                    new String[] { "Leute zum Lächeln zu bringen", "Ein Ziel erreichen", "Ein Problem lösen",
                            "Zu sehen, wie im Garten alles wächst" },
                    new String[] { "interpersonal", "intrapersonal", "mathematical", "naturally" }));

    private Questions q15 = new Questions("15. Glaubst du an ein Leben nach dem Tod?",
            new Answer(
                    new String[] { "Ja", "Ich glaube an irgendetwas", "Ich müsste es schon sehen, um es zu glauben",
                            "Ich glaube an die Zyklen der Natur" },
                    new String[] { "interpersonal", "intrapersonal", "mathematical",
                            "naturally" }));

    private Questions q16 = new Questions("16. Was denkst du, ist deine grösste Verantwortung?",
            new Answer(
                    new String[] { "Positive Energie verbreiten", "Mit Rat und Tat zur Seite stehen",
                            "Meine Liebsten zu beschützen",
                            "Ein gutes Vorbild sein" },
                    new String[] { "intrapersonal", "naturally", "interpersonal", "intrapersonal" }));

    private Questions q17 = new Questions("17. Was ist das Wichtigste, wenn zwei Menschen miteinander interagieren?",
            new Answer(new String[] { "Wissen", "Ehrlichkeit", "Pflege", "Loyalität" },
                    new String[] { "naturally", "interpersonal", "spatial", "intrapersonal" }));

    private Questions q18 = new Questions("18. Was denkst du, fehlt in der modernen Gesellschaft?",
            new Answer(new String[] { "Verantwortung", "Freiheit", "Logisches Denken", "Umfassendes Wissen" },
                    new String[] { "spatial", "intrapersonal", "mathematical", "naturally" }));

    private Questions q19 = new Questions("19. Wenn du die Möglichkeit hättest, würdest du ewig Leben?",
            new Answer(
                    new String[] { "Nur, wenn ich meine Zeit sinnvolll nutzen würde",
                            "Nur wenn ich für immer jung bleiben würde. ", "Ja, klar",
                            "Ich akzeptiere, was auch immer mir gegeben wird." },
                    new String[] { "mathematical", "bodily", "intrapersonal", "naturally" }));

    private Questions q20 = new Questions("20. Als was für eine Person siehst du dich?",
            new Answer(
                    new String[] { "weise und erfahren", "selbstlos und hilfsbereit", "stark und sensibel",
                            "mysteriös und aufregend" },
                    new String[] { "naturally", "interpersonal", "spatial", "intrapersonal" }));

    private ArrayList<Questions> questions = new ArrayList<Questions>();

    public AllQuestions() {
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);
        questions.add(q5);
        questions.add(q6);
        questions.add(q7);
        questions.add(q8);
        questions.add(q9);
        questions.add(q10);
        questions.add(q11);
        questions.add(q12);
        questions.add(q13);
        questions.add(q14);
        questions.add(q15);
        questions.add(q16);
        questions.add(q17);
        questions.add(q18);
        questions.add(q19);
        questions.add(q20);
    }

    public ArrayList<Questions> getAllQuestions(){
        return questions;
    }
}
