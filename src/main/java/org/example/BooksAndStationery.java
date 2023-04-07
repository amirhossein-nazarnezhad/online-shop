package org.example;

import java.util.ArrayList;

public class BooksAndStationery extends Products {


    //=============================================================================

    //constructor

    public BooksAndStationery(double price, String name, String color, String weight, String typeProduct) {
        super(price, name, color, weight, typeProduct);
    }

    //=====================================================================================

    //array list

    ArrayList<BooksAndStationery> pencil = new ArrayList<>();
    ArrayList<BooksAndStationery> pen = new ArrayList<>();
    ArrayList<BooksAndStationery> table = new ArrayList<>();
    ArrayList<BooksAndStationery> pencilCase = new ArrayList<>();
    ArrayList<BooksAndStationery> noteBook = new ArrayList<>();
    ArrayList<BooksAndStationery> eraser = new ArrayList<>();
    ArrayList<BooksAndStationery> ruler = new ArrayList<>(); //khatkesh

    //==================================================================================

    //just getter

    public ArrayList<BooksAndStationery> getPencil() {
        return pencil;
    }

    public ArrayList<BooksAndStationery> getPen() {
        return pen;
    }

    public ArrayList<BooksAndStationery> getTable() {
        return table;
    }

    public ArrayList<BooksAndStationery> getPencilCase() {
        return pencilCase;
    }

    public ArrayList<BooksAndStationery> getNoteBook() {
        return noteBook;
    }

    public ArrayList<BooksAndStationery> getEraser() {
        return eraser;
    }

    public ArrayList<BooksAndStationery> getRuler() {
        return ruler;
    }

    //==================================================================================================

    //add to list

    public void addPencil(BooksAndStationery pencil1)
    {
        pencil.add(pencil1);
    }

    public void addPen(BooksAndStationery pen1)
    {
        pen.add(pen1);
    }

    public void addTable(BooksAndStationery table1)
    {
        table.add(table1);
    }

    public void addPencilCase(BooksAndStationery pencilCase1)
    {
        pencilCase.add(pencilCase1);
    }

    public void addNotebook(BooksAndStationery notebook1)
    {
        noteBook.add(notebook1);
    }

    public void addEraser(BooksAndStationery eraser1)
    {
        eraser.add(eraser1);
    }

    public void addRuler(BooksAndStationery ruler1)
    {
        ruler.add(ruler1);
    }


    //====================================================================================================

    //to string


    @Override
    public String toString() {
        return "BooksAndStationery{" +
                "pencil=" + pencil +
                ", pen=" + pen +
                ", table=" + table +
                ", pencilCase=" + pencilCase +
                ", noteBook=" + noteBook +
                ", eraser=" + eraser +
                ", ruler=" + ruler +
                '}';
    }
}
