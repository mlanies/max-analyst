package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bpf extends ffe implements a66 {
    public final /* synthetic */ TextView X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpf(TextView textView, Continuation continuation) {
        super(2, continuation);
        this.X = textView;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bpf bpfVar = (bpf) n((on5) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bpfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bpf(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        TextView textView = this.X;
        CharSequence text = textView.getText();
        if (text != null) {
            xfg.c(text, qp4.u0.b(textView.getContext()).i());
        }
        return e5f.a;
    }
}
