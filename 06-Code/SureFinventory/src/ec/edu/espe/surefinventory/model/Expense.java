package ec.edu.espe.surefinventory.model;

import java.util.Calendar;

public class Expense {
    private double amount;
    private String description;
    private Calendar date;

    public Expense(double amount, String description, Calendar date) {
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format(
            "%-15s | %-30s | %-25s%n" +
            "--------------------------------------------------%n" +
            "$%-14.2f | %-30s | %-25s",
            "Amount", "Description", "Date",
            amount, description, date.toString()
        );
    }
}