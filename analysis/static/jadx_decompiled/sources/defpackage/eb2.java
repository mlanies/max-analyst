package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class eb2 extends ffe implements a66 {
    public final /* synthetic */ zb2 X;
    public final /* synthetic */ String Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb2(zb2 zb2Var, String str, Continuation continuation) {
        super(2, continuation);
        this.X = zb2Var;
        this.Y = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((eb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new eb2(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        nkc nkcVar;
        List listA;
        od2.a0(obj);
        String str = zb2.K0;
        zb2 zb2Var = this.X;
        alc alcVarE = zb2Var.e();
        alcVarE.getClass();
        xlc xlcVarA = xlc.a(1, "SELECT * FROM chat_folder WHERE id = ?");
        String str2 = this.Y;
        if (str2 == null) {
            xlcVarA.W(1);
        } else {
            xlcVarA.f(1, str2);
        }
        ilc ilcVar = alcVarE.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "title");
            int iN3 = tfg.n(cursorO, "emoji");
            int iN4 = tfg.n(cursorO, "order");
            int iN5 = tfg.n(cursorO, "filters");
            int iN6 = tfg.n(cursorO, "isHiddenForAllFolder");
            int iN7 = tfg.n(cursorO, "hideIfEmpty");
            int iN8 = tfg.n(cursorO, "elements");
            int iN9 = tfg.n(cursorO, "creatorId");
            int iN10 = tfg.n(cursorO, "filterSubjects");
            int iN11 = tfg.n(cursorO, "widgets");
            int iN12 = tfg.n(cursorO, "options");
            int iN13 = tfg.n(cursorO, "isRemoved");
            if (cursorO.moveToFirst()) {
                String string = cursorO.isNull(iN) ? null : cursorO.getString(iN);
                String string2 = cursorO.isNull(iN2) ? null : cursorO.getString(iN2);
                String string3 = cursorO.isNull(iN3) ? null : cursorO.getString(iN3);
                int i = cursorO.getInt(iN4);
                EnumSet enumSetI = dy7.I(cursorO.isNull(iN5) ? null : cursorO.getString(iN5));
                boolean z = cursorO.getInt(iN6) != 0;
                boolean z2 = cursorO.getInt(iN7) != 0;
                byte[] blob = cursorO.isNull(iN8) ? null : cursorO.getBlob(iN8);
                if (blob != null) {
                    Protos.MessageElements messageElements = new Protos.MessageElements();
                    qw8.mergeFrom(messageElements, blob);
                    listA = ou8.a(messageElements.elements);
                } else {
                    listA = nz4.a;
                }
                nkcVar = new nkc(string, string2, string3, i, enumSetI, z, z2, listA, cursorO.isNull(iN9) ? null : Long.valueOf(cursorO.getLong(iN9)), dy7.q(cursorO.isNull(iN10) ? null : cursorO.getBlob(iN10)), dy7.s(cursorO.isNull(iN11) ? null : cursorO.getBlob(iN11)), dy7.r(cursorO.isNull(iN12) ? null : cursorO.getBlob(iN12)), cursorO.getInt(iN13) != 0);
            } else {
                nkcVar = null;
            }
            if (nkcVar == null) {
                return null;
            }
            ArrayList arrayListE = zb2Var.e().e(str2);
            wz4 wz4Var = wz4.a;
            return nkcVar.a(arrayListE, wz4Var, wz4Var, (hda) zb2Var.o.getValue());
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }
}
