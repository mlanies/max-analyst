package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public final class sp4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xlc b;
    public final /* synthetic */ tp4 c;

    public /* synthetic */ sp4(tp4 tp4Var, xlc xlcVar, int i) {
        this.a = i;
        this.c = tp4Var;
        this.b = xlcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        i20 i20Var;
        i20 i20Var2;
        switch (this.a) {
            case 0:
                String str = null;
                Cursor cursorO = this.c.a.o(this.b, null);
                try {
                    int iN = tfg.n(cursorO, ClientCookie.PATH_ATTR);
                    int iN2 = tfg.n(cursorO, "last_modified");
                    int iN3 = tfg.n(cursorO, "upload_type");
                    int iN4 = tfg.n(cursorO, "chat_id");
                    int iN5 = tfg.n(cursorO, "attach_id");
                    int iN6 = tfg.n(cursorO, "video_quality");
                    int iN7 = tfg.n(cursorO, "video_start_trim_position");
                    int iN8 = tfg.n(cursorO, "video_end_trim_position");
                    int iN9 = tfg.n(cursorO, "mute");
                    ArrayList arrayList = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        String string = cursorO.isNull(iN) ? str : cursorO.getString(iN);
                        long j = cursorO.getLong(iN2);
                        int iX = ngg.x(cursorO.isNull(iN3) ? str : Integer.valueOf(cursorO.getInt(iN3)));
                        fp4 fp4Var = new fp4(cursorO.getLong(iN4), cursorO.isNull(iN5) ? str : cursorO.getString(iN5));
                        if (cursorO.isNull(iN6) && cursorO.isNull(iN7) && cursorO.isNull(iN8) && cursorO.isNull(iN9)) {
                            i20Var = null;
                        } else {
                            i20 i20Var3 = new i20();
                            i20Var3.a = mqb.values()[(cursorO.isNull(iN6) ? null : Integer.valueOf(cursorO.getInt(iN6))).intValue()];
                            i20Var3.b = cursorO.getFloat(iN7);
                            i20Var3.c = cursorO.getFloat(iN8);
                            i20Var3.d = cursorO.getInt(iN9) != 0;
                            i20Var = i20Var3;
                        }
                        arrayList.add(new np4(fp4Var, string, j, iX, i20Var));
                        str = null;
                    }
                    cursorO.close();
                    return arrayList;
                } finally {
                }
            default:
                String str2 = null;
                Cursor cursorO2 = this.c.a.o(this.b, null);
                try {
                    int iN10 = tfg.n(cursorO2, ClientCookie.PATH_ATTR);
                    int iN11 = tfg.n(cursorO2, "last_modified");
                    int iN12 = tfg.n(cursorO2, "upload_type");
                    int iN13 = tfg.n(cursorO2, "chat_id");
                    int iN14 = tfg.n(cursorO2, "attach_id");
                    int iN15 = tfg.n(cursorO2, "video_quality");
                    int iN16 = tfg.n(cursorO2, "video_start_trim_position");
                    int iN17 = tfg.n(cursorO2, "video_end_trim_position");
                    int iN18 = tfg.n(cursorO2, "mute");
                    ArrayList arrayList2 = new ArrayList(cursorO2.getCount());
                    while (cursorO2.moveToNext()) {
                        String string2 = cursorO2.isNull(iN10) ? str2 : cursorO2.getString(iN10);
                        long j2 = cursorO2.getLong(iN11);
                        int iX2 = ngg.x(cursorO2.isNull(iN12) ? str2 : Integer.valueOf(cursorO2.getInt(iN12)));
                        fp4 fp4Var2 = new fp4(cursorO2.getLong(iN13), cursorO2.isNull(iN14) ? str2 : cursorO2.getString(iN14));
                        if (cursorO2.isNull(iN15) && cursorO2.isNull(iN16) && cursorO2.isNull(iN17) && cursorO2.isNull(iN18)) {
                            i20Var2 = null;
                        } else {
                            i20 i20Var4 = new i20();
                            i20Var4.a = mqb.values()[(cursorO2.isNull(iN15) ? null : Integer.valueOf(cursorO2.getInt(iN15))).intValue()];
                            i20Var4.b = cursorO2.getFloat(iN16);
                            i20Var4.c = cursorO2.getFloat(iN17);
                            i20Var4.d = cursorO2.getInt(iN18) != 0;
                            i20Var2 = i20Var4;
                        }
                        arrayList2.add(new np4(fp4Var2, string2, j2, iX2, i20Var2));
                        str2 = null;
                    }
                    cursorO2.close();
                    return arrayList2;
                } finally {
                }
        }
    }

    public final void finalize() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            default:
                this.b.n();
                break;
        }
    }
}
