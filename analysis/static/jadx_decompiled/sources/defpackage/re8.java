package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class re8 extends ffe implements a66 {
    public File X;
    public String Y;
    public int Z;
    public final /* synthetic */ te8 s0;
    public final /* synthetic */ zp7 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re8(te8 te8Var, zp7 zp7Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = te8Var;
        this.t0 = zp7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((re8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new re8(this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        File fileQ;
        String absolutePath;
        File file;
        String str;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        te8 te8Var = this.s0;
        if (i == 0) {
            od2.a0(obj);
            fileQ = ((kk5) ((zi5) te8Var.Y.getValue())).q(String.valueOf(System.currentTimeMillis()));
            Uri uriN = j47.N(this.t0.b.toString());
            absolutePath = fileQ.getAbsolutePath();
            if (uriN != null) {
                this.X = fileQ;
                this.Y = absolutePath;
                this.Z = 1;
                if (te8.q(te8Var, fileQ, uriN, this) == tx3Var) {
                    return tx3Var;
                }
                file = fileQ;
                str = absolutePath;
            }
            pnf.o(te8Var.v0, new ke8(Uri.fromFile(fileQ), absolutePath));
            return e5f.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = this.Y;
        file = this.X;
        od2.a0(obj);
        j47.c0((y7d) te8Var.Z.getValue(), str, str);
        j47.a0((y7d) te8Var.Z.getValue(), str);
        fileQ = file;
        absolutePath = str;
        pnf.o(te8Var.v0, new ke8(Uri.fromFile(fileQ), absolutePath));
        return e5f.a;
    }
}
