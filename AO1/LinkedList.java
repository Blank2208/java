package AO1;

// LinkedList ist quasi der Zug, der den Fahrplan kennt
public class LinkedList implements MyCollection{
    // Klassenattribute der LinkedList - private gemacht, da nur ueber getter und setter Methoden information nach außen kommen sollen (laut Uebung bzw. Vorlesung)
    private int size;   // Groesse der LinkedList
    private ListElement head;   // Ausgabe head-Element
    private ListElement tail;   // Ausgabe tail-element

    // Standardkonstruktor der LinkedList
    public LinkedList(){
        this.size = 0;  // Startgroesse der LinkedList ist 0
        this.head = null;   // Leere Liste hat keinen Kopf
        this.tail = null;   // Leere Liste hat keinen Schwanz
    }

    public LinkedList(MyCollection otherCollection){
        this(); // Ruft den Konstruktor oben auf (initialisiert also size, head und tail
        int[] elementsToCopy = otherCollection.elements(); // Nutzt die elements()-Methode des Interfaces
        for (int element : elementsToCopy) {  // Jedes Element in die neue LinkedList einfügen
            this.add(element); // Fügt jedes Element mit der add-Methode der LinkedList hinzu
        }

    }
    // Getter Methoden der LinkedList
    public int getSize(){
        return this.size;
    }

    public ListElement getHead(){
        return this.head;
    }

    public ListElement getTail(){
        return this.tail;
    }

    // ListElement ist einer von vielen Wagons, die am Zug befestigt sind
    public static class ListElement {
       private int value;
       private ListElement next;

       // Konstruktor
       public ListElement(int value){
           this.value = value;
           this.next = null;
       }

       // Getter Methoden für ListElement-Attribute
       public int getValue() {
           return this.value;
       }

       public ListElement getNext(){
           return this.next;
       }

       // Setter-Methoden
        public void setValue(int value){
           this.value = value;
        }

        public void setNext(ListElement next){
           this.next = next;
        }
    }

    // Methoden fuer MyCollection
    @Override // Zeigt an, dass diese Methode eine Methode aus einem Interface überschreibt.
    public void add(int element){
        ListElement newElement = new ListElement(element);  // Ein neues ListElement mit dem übergebenen Wert 'element' erstellen
        // Wenn Liste leer ist, dann muss das neue Element sowohl head als auch tail sein
        if(this.head == null){
            this.head = newElement;
            this.tail = newElement;
        }
        // Wenn Liste nicht leer ist, dann fuegen wir das Element am Ende der Liste (tail) hinzu
        else {
            this.tail.setNext(newElement);
            this.tail = newElement;
        }
        this.size++; // Da ein neues Element hinzugefuegt wurde, muessen wir auch die groesse erhoehen
    }


    @Override
    public void remove(int element){
        if(this.head == null){
            return;
        }

        if(this.head.value == element){
            this.head = this.head.next; // Naechster head wird zum aktuellen head

            if(this.head == null){
                this.tail = null; // Wenn gerade der head zu null wurde muss auch tail zu null werden
            }
            this.size--;
            return;
        }

        // Fall, wenn das gesuchte Element nicht direkt im Head ist
        ListElement currentHead = this.head;
        ListElement nextHead = this.head.next;

        while(nextHead != null){
            if(nextHead.value == element){
                currentHead.next = nextHead.next;

                if(nextHead == this.tail){
                    this.tail = currentHead;
                }
                this.size--;
                return;
            }
            currentHead = nextHead;
            nextHead = nextHead.next;
        }
    }


    @Override
    public boolean contains(int element){
        if(this.head == null){
            return false;
        }

        if(this.head.value == element){
            return true;
        }

        ListElement currentHead = this.head;
        while(currentHead != null){
            if(currentHead.value == element){
                return true;
            }
            currentHead = currentHead.getNext();   // Springe zum naechsten Head, wenn du das Element nicht hast
        }
        return false;   // While-Schleife hat null erreicht, das Element ist nicht in der LinkedList
    }


    @Override
    public int size() {
        return this.size;
    }


    @Override
    public int[] elements(){
        int[] elements = new int [this.size];
        if(this.head == null){
            return elements;
        }

        ListElement currentHead = this.head;
        int index = 0;
        while(currentHead != null){
            elements[index] = currentHead.value;
            index++;
            currentHead = currentHead.next;

        }
       return elements;
    }


    // Wandle Array in ein einzigen String um
    @Override
    public String toString(){
        String arrayAsString = "";
        int[] elements = elements();  // Hole dir alle Elemente als Liste
        if(elements == null || elements.length == 0){
            return arrayAsString;
        }
        int laufVariable = 0;
        for (int element : elements){
            laufVariable++;
            if(laufVariable == elements.length){
                arrayAsString += element;
            }
            else{
                arrayAsString += element + ",";
            }
        }
        return arrayAsString;
    }

    // Neue Methoden fuer den Stack
    public void addHead(int element) {
        ListElement newElement = new ListElement(element);

        if (this.head == null) {
            this.head = newElement;
            this.tail = newElement;
        } else {
            newElement.next = this.head;
            this.head = newElement;
        }
        size++;
    }


    public int removeHead() {
        // Tail ist immer das am weitesten rechts stehende Element, Head immer das links
        if(this.head == null) {
            return -1;
        }

        // Der aktuelle head wird zum naechsten head (bspw. bei 10 --> 20 --> 30 wird nun 20--> 30
        int removed = this.head.value;  // Wir muessen einen int-Wert zurueckgeben
        this.head = this.head.next; // Der aktuelle Head soll ja entfernt werden, dadurch setzen wir ihn dann auf den naechsten

        // Wenn das naechste Element null ist
        if (this.head == null) {
            this.tail = null;
        }
        size--; // Da Element entfernt, reduzieren wir die size der Liste
        return removed;
    }


}
