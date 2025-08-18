package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g67 extends ffe implements a66 {
    public final /* synthetic */ h67 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g67(h67 h67Var, Continuation continuation) {
        super(2, continuation);
        this.X = h67Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((g67) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new g67(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        h67 h67Var = this.X;
        Bitmap bitmap = ((iqb) h67Var.s0.getValue()).c;
        if (bitmap == null) {
            return null;
        }
        je7 je7Var = h67Var.o;
        File file = new File(((kk5) je7Var.getValue()).m(), "qr_tmp.png");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            Uri uriF = ((kk5) je7Var.getValue()).f((Context) h67Var.b.getValue(), file);
            v3c.i(fileOutputStream, null);
            return uriF;
        } finally {
        }
    }
}
