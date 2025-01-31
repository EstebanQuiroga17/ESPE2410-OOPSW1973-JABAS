package ec.edu.espe.easyorder.controller;

import ec.edu.espe.easyorder.model.Expense;
import ec.edu.espe.easyorder.model.Invoice;
import org.bson.Document;
import utils.MongoDbManager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * 
 * Author Matias Rojas
 */

public class AccountingReportController {
    
    public List<Expense> sortExpensesByDate(Calendar beginningDate, Calendar endingDate){
        List<Expense> sortedExpenses = new ArrayList<>();
        List<Expense> allExpenses = new ArrayList<>();
        List<Document> expenseDocuments = new ArrayList<>();
        Calendar expenseDate;
        
        expenseDocuments = MongoDbManager.getAll("Expenses");
        allExpenses = ExpenseController.docListToExpense(expenseDocuments);
        
        for(Expense expense : allExpenses){
            expenseDate = Calendar.getInstance();
            if(expenseDate.compareTo(endingDate) < 0 && expenseDate.compareTo(beginningDate)>0){
               sortedExpenses.add(expense);
            }
        }
        return sortedExpenses;
    }
    
    
}