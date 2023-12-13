import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context, factory: SQLiteDatabase.CursorFactory?) :
        SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION) {

        override fun onCreate(db: SQLiteDatabase) {
                val query = ("CREATE TABLE " + TABLE_NAME + " ("
                        + ROLL_NO_COL + " TEXT PRIMARY KEY, " +
                        NAME_COl + " TEXT," +
                        MARKS_COL + " TEXT" + ")")


                db.execSQL(query)
        }

        override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
                db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
                onCreate(db)
        }

        fun addName(roll_no:String,name : String, age : String ){


                val values = ContentValues()

                values.put(ROLL_NO_COL,roll_no);
                values.put(NAME_COl, name)
                values.put(MARKS_COL, age)


                val db = this.writableDatabase

                db.insert(TABLE_NAME, null, values)

                db.close()
        }


        fun getRecords(): Cursor? {


                val db = this.readableDatabase


                return db.rawQuery("SELECT * FROM " + TABLE_NAME, null)

        }

        companion object{

                private val DATABASE_NAME = "Students"


                private val DATABASE_VERSION = 1

                val TABLE_NAME = "Records"

                val ROLL_NO_COL = "roll_no"

                val NAME_COl = "name"

                val MARKS_COL = "marks"
        }
}