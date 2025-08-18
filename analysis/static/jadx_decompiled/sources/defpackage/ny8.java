package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public final class ny8 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xlc b;
    public final /* synthetic */ oy8 c;

    public /* synthetic */ ny8(oy8 oy8Var, xlc xlcVar, int i) {
        this.a = i;
        this.c = oy8Var;
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
                    int iN4 = tfg.n(cursorO, "message_id");
                    int iN5 = tfg.n(cursorO, "chat_id");
                    int iN6 = tfg.n(cursorO, "attach_id");
                    int iN7 = tfg.n(cursorO, "video_quality");
                    int iN8 = tfg.n(cursorO, "video_start_trim_position");
                    int iN9 = tfg.n(cursorO, "video_end_trim_position");
                    int iN10 = tfg.n(cursorO, "mute");
                    ArrayList arrayList = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        bu1 bu1Var = new bu1();
                        bu1Var.a = cursorO.getLong(iN4);
                        bu1Var.b = cursorO.getLong(iN5);
                        if (cursorO.isNull(iN6)) {
                            bu1Var.c = str;
                        } else {
                            bu1Var.c = cursorO.getString(iN6);
                        }
                        if (cursorO.isNull(iN7) && cursorO.isNull(iN8) && cursorO.isNull(iN9) && cursorO.isNull(iN10)) {
                            i20Var = str;
                        } else {
                            i20 i20Var3 = new i20();
                            i20Var3.a = mqb.values()[(cursorO.isNull(iN7) ? str : Integer.valueOf(cursorO.getInt(iN7))).intValue()];
                            i20Var3.b = cursorO.getFloat(iN8);
                            i20Var3.c = cursorO.getFloat(iN9);
                            i20Var3.d = cursorO.getInt(iN10) != 0;
                            i20Var = i20Var3;
                        }
                        ky8 ky8Var = new ky8();
                        if (cursorO.isNull(iN)) {
                            ky8Var.b = str;
                        } else {
                            ky8Var.b = cursorO.getString(iN);
                        }
                        int i = iN4;
                        int i2 = iN5;
                        ky8Var.c = cursorO.getLong(iN2);
                        ky8Var.d = ngg.x(cursorO.isNull(iN3) ? null : Integer.valueOf(cursorO.getInt(iN3)));
                        ky8Var.a = bu1Var;
                        ky8Var.e = i20Var;
                        arrayList.add(ky8Var);
                        iN4 = i;
                        iN5 = i2;
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
                    int iN11 = tfg.n(cursorO2, ClientCookie.PATH_ATTR);
                    int iN12 = tfg.n(cursorO2, "last_modified");
                    int iN13 = tfg.n(cursorO2, "upload_type");
                    int iN14 = tfg.n(cursorO2, "message_id");
                    int iN15 = tfg.n(cursorO2, "chat_id");
                    int iN16 = tfg.n(cursorO2, "attach_id");
                    int iN17 = tfg.n(cursorO2, "video_quality");
                    int iN18 = tfg.n(cursorO2, "video_start_trim_position");
                    int iN19 = tfg.n(cursorO2, "video_end_trim_position");
                    int iN20 = tfg.n(cursorO2, "mute");
                    ArrayList arrayList2 = new ArrayList(cursorO2.getCount());
                    while (cursorO2.moveToNext()) {
                        bu1 bu1Var2 = new bu1();
                        bu1Var2.a = cursorO2.getLong(iN14);
                        bu1Var2.b = cursorO2.getLong(iN15);
                        if (cursorO2.isNull(iN16)) {
                            bu1Var2.c = str2;
                        } else {
                            bu1Var2.c = cursorO2.getString(iN16);
                        }
                        if (cursorO2.isNull(iN17) && cursorO2.isNull(iN18) && cursorO2.isNull(iN19) && cursorO2.isNull(iN20)) {
                            i20Var2 = str2;
                        } else {
                            i20 i20Var4 = new i20();
                            i20Var4.a = mqb.values()[(cursorO2.isNull(iN17) ? str2 : Integer.valueOf(cursorO2.getInt(iN17))).intValue()];
                            i20Var4.b = cursorO2.getFloat(iN18);
                            i20Var4.c = cursorO2.getFloat(iN19);
                            i20Var4.d = cursorO2.getInt(iN20) != 0;
                            i20Var2 = i20Var4;
                        }
                        ky8 ky8Var2 = new ky8();
                        if (cursorO2.isNull(iN11)) {
                            ky8Var2.b = str2;
                        } else {
                            ky8Var2.b = cursorO2.getString(iN11);
                        }
                        int i3 = iN14;
                        int i4 = iN15;
                        ky8Var2.c = cursorO2.getLong(iN12);
                        ky8Var2.d = ngg.x(cursorO2.isNull(iN13) ? null : Integer.valueOf(cursorO2.getInt(iN13)));
                        ky8Var2.a = bu1Var2;
                        ky8Var2.e = i20Var2;
                        arrayList2.add(ky8Var2);
                        iN14 = i3;
                        iN15 = i4;
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
