package com.otc.utility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by davesuda on 12/11/2015.
 */
public class SqLiteHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "OTC.db";
    private static final int DATABASE_VERSION = 1;



//##########################################################################################/////


    private static final String TABLE_CUSTOMER_DETAILS = "CustomerDetails";
    private static final String CUSTOMER_COLUMN_ID = "id";
    private static final String CUSTOMER_FIRST_NAME = "FirstName";
    private static final String CUSTOMER_LAST_NAME  = "LastName";
    private static final String CUSTOMER_OTC_CARD = "OtcCard";
    private static final String CUSTOMER_EMAIL = "Email";
    private static final String CUSTOMER_MOBILE = "Mobile";
    private static final String CUSTOMER_STREET = "Street";
    private static final String CUSTOMER_CITY = "City";
    private static final String CUSTOMER_STATE = "State";
    private static final String CUSTOMER_POSTAL_CODE = "PostalCode";
    private static final String CUSTOMER_COUNTRY_ID = "CountryId";
    private static final String CUSTOMER_CREATED_AT = "CreatedAt";
    private static final String CUSTOMER_UPDATED_AT = "UpdatedAt";



//##########################################################################################/////



    private static final String TABLE_TICKETS_DETAIL = "CustomerTickets";
    private static final String TICKETS_ID = "TicketId";
    private static final String TICKETS_TITLE = "Title";
    private static final String TICKETS_DESCRIPTION = "Description";
    private static final String TICKETS_NOTES = "Notes";
    private static final String TICKETS_RESOLUTION = "Resolution";
    private static final String TICKETS_SEVERITY = "Severity";
    private static final String TICKETS_STATUS = "Status";
    private static final String TICKETS_CREATED = "CreatedAt";
    private static final String TICKETS_UPDATED = "UpdatedAt";

//##########################################################################################/////


    private static final String TABLE_CATEGORY_DETAIL = "CategoryDetails";
    private static final String CATEGORY_ID = "categoryID";
    private static final String PARENT_ID = "parentID";
    private static final String NAME = "name";
    private static final String CREATED_AT = "CreatedAt";
    private static final String UPDATED_AT = "UpdatedAt";

    //##########################################################################################/////







    Context mContext;
    private SQLiteDatabase db;

    public SqLiteHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        this.mContext = context;
        this.db = this.getWritableDatabase();
    }


    public SqLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
