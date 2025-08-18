package defpackage;

import ru.ok.messages.video.widgets.FloatingVideoView;

/* loaded from: classes2.dex */
public final /* synthetic */ class n1b implements in5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ o1b b;

    public /* synthetic */ n1b(o1b o1bVar) {
        this.b = o1bVar;
    }

    @Override // defpackage.in5
    public final void a() {
        switch (this.a) {
            case 0:
                this.b.g(true);
                break;
            default:
                FloatingVideoView floatingVideoView = this.b.C0;
                if (floatingVideoView != null) {
                    floatingVideoView.getContext();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n1b(o1b o1bVar, es8 es8Var, l20 l20Var) {
        this.b = o1bVar;
    }
}
