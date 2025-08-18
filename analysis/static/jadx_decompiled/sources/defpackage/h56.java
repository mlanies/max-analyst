package defpackage;

import android.database.Cursor;
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class h56 {
    public static final String[] d = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    public final String a;
    public final Set b;
    public final Set c;

    public h56(String str, AbstractSet abstractSet, Set set) {
        this.a = str;
        this.b = abstractSet;
        this.c = set;
    }

    public static final h56 a(k36 k36Var, String str) {
        wbd wbdVar = new wbd();
        Cursor cursorQ0 = k36Var.q0("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorQ0.getColumnCount() > 0) {
                int columnIndex = cursorQ0.getColumnIndex("name");
                while (cursorQ0.moveToNext()) {
                    wbdVar.add(cursorQ0.getString(columnIndex));
                }
            }
            v3c.i(cursorQ0, null);
            wbd wbdVarA = z7.a(wbdVar);
            cursorQ0 = k36Var.q0("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                String string = cursorQ0.moveToFirst() ? cursorQ0.getString(cursorQ0.getColumnIndexOrThrow("sql")) : "";
                v3c.i(cursorQ0, null);
                return new h56(str, wbdVarA, lz7.E(string));
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h56)) {
            return false;
        }
        h56 h56Var = (h56) obj;
        if (tpa.f(this.a, h56Var.a) && tpa.f(this.b, h56Var.b)) {
            return tpa.f(this.c, h56Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FtsTableInfo{name='" + this.a + "', columns=" + this.b + ", options=" + this.c + "'}";
    }

    public h56(String str, HashSet hashSet, String str2) {
        this(str, hashSet, lz7.E(str2));
    }
}
