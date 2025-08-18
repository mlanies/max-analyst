package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class db2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zb2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db2(zb2 zb2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = zb2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((db2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new db2(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zb2 zb2Var = this.Y;
            String str = zb2.K0;
            alc alcVarE = zb2Var.e();
            this.X = 1;
            alcVarE.getClass();
            obj = ote.i(alcVarE.a, new CancellationSignal(), new ykc(alcVarE, xlc.a(0, "SELECT * FROM chat_folder WHERE isHiddenForAllFolder = 1"), 2), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        xs xsVar = new xs(0);
        EnumSet enumSetNoneOf = EnumSet.noneOf(pa2.class);
        zb2 zb2Var2 = this.Y;
        for (nkc nkcVar : (List) obj) {
            String str2 = zb2.K0;
            alc alcVarE2 = zb2Var2.e();
            String str3 = nkcVar.a;
            alcVarE2.getClass();
            xlc xlcVarA = xlc.a(1, "SELECT chatId FROM folder_and_chats WHERE folderId = ?");
            if (str3 == null) {
                xlcVarA.W(1);
            } else {
                xlcVarA.f(1, str3);
            }
            ilc ilcVar = alcVarE2.a;
            ilcVar.b();
            Cursor cursorO = ilcVar.o(xlcVarA, null);
            try {
                ArrayList arrayList = new ArrayList(cursorO.getCount());
                while (cursorO.moveToNext()) {
                    arrayList.add(cursorO.isNull(0) ? null : Long.valueOf(cursorO.getLong(0)));
                }
                cursorO.close();
                xlcVarA.n();
                xsVar.addAll(arrayList);
                enumSetNoneOf.addAll(nkcVar.e);
            } catch (Throwable th) {
                cursorO.close();
                xlcVarA.n();
                throw th;
            }
        }
        at5 at5VarA = ((nkc) this.Y.B0.getValue()).a(nz4.a, xsVar, enumSetNoneOf, (hda) this.Y.o.getValue());
        this.Y.D0 = at5VarA;
        this.Y.t0.put("all.chat.folder", at5VarA);
        return at5VarA;
    }
}
