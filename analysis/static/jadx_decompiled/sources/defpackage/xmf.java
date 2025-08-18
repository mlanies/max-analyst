package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xmf implements OnReceiveContentListener {
    public final v3a a;

    public xmf(v3a v3aVar) {
        this.a = v3aVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        bt3 bt3Var = new bt3(new wd6(contentInfo));
        bt3 bt3VarA = this.a.a(view, bt3Var);
        if (bt3VarA == null) {
            return null;
        }
        if (bt3VarA == bt3Var) {
            return contentInfo;
        }
        ContentInfo contentInfoP = bt3VarA.a.p();
        Objects.requireNonNull(contentInfoP);
        return m30.m(contentInfoP);
    }
}
