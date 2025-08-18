package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cpf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ TextView Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpf(TextView textView, Continuation continuation) {
        super(2, continuation);
        this.Y = textView;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        cpf cpfVar = (cpf) n((fka) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        cpfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        cpf cpfVar = new cpf(this.Y, continuation);
        cpfVar.X = obj;
        return cpfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        fka fkaVar = (fka) this.X;
        CharSequence text = this.Y.getText();
        if (text != null) {
            xfg.c(text, fkaVar);
        }
        return e5f.a;
    }
}
