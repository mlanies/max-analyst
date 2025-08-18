package defpackage;

import android.database.Cursor;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jb2 extends ffe implements a66 {
    public final /* synthetic */ zb2 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb2(zb2 zb2Var, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.X = zb2Var;
        this.Y = str;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((jb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new jb2(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        String str = zb2.K0;
        alc alcVarE = this.X.e();
        alcVarE.getClass();
        xlc xlcVarA = xlc.a(2, "SELECT COUNT(*) FROM folder_and_chats WHERE folderId = ? AND chatId = ?");
        String str2 = this.Y;
        if (str2 == null) {
            xlcVarA.W(1);
        } else {
            xlcVarA.f(1, str2);
        }
        xlcVarA.j(2, this.Z);
        ilc ilcVar = alcVarE.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            long j = cursorO.moveToFirst() ? cursorO.getLong(0) : 0L;
            cursorO.close();
            xlcVarA.n();
            return Boolean.valueOf(j != 0);
        } catch (Throwable th) {
            cursorO.close();
            xlcVarA.n();
            throw th;
        }
    }
}
