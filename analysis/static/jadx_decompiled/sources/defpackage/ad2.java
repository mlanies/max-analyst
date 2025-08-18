package defpackage;

import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class ad2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ad2(s3e s3eVar, m6e m6eVar) {
        this.a = 7;
        this.c = s3eVar;
        this.b = m6eVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                ((m56) obj2).invoke((vm8) obj);
                break;
            case 1:
                ((a66) obj2).invoke(Long.valueOf(((nn3) obj).a), view);
                break;
            case 2:
                z2e z2eVar = ((jw7) obj2).H0;
                if (z2eVar != null) {
                    ((w2e) obj).g(z2eVar);
                    break;
                }
                break;
            case 3:
                ((a66) obj2).invoke(Long.valueOf(((kn8) obj).a), view);
                break;
            case 4:
                ht8 ht8Var = (ht8) obj;
                long j = ht8Var.J0;
                bc7[] bc7VarArr = MessagesListWidget.X0;
                ((b69) ((xs8) obj2)).a.z0(j, ht8Var.I0);
                break;
            case 5:
                gza gzaVar = ((pxa) obj).s0;
                break;
            case 6:
                z2e z2eVar2 = ((jw7) obj2).H0;
                if (z2eVar2 != null) {
                    ((w2e) obj).g(z2eVar2);
                    break;
                }
                break;
            case 7:
                y0d y0dVar = ((s3e) obj).J0;
                if (y0dVar != null) {
                    ((m56) obj2).invoke(y0dVar);
                    break;
                }
                break;
            default:
                z2e z2eVar3 = ((jw7) obj2).H0;
                if (z2eVar3 != null) {
                    ((w2e) obj).g(z2eVar3);
                    break;
                }
                break;
        }
        return true;
    }

    public /* synthetic */ ad2(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
