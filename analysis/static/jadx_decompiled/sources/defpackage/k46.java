package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.b;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* loaded from: classes2.dex */
public final /* synthetic */ class k46 implements y2a, qj3, fnb {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachVideo b;

    public /* synthetic */ k46(FrgAttachVideo frgAttachVideo, int i) {
        this.a = i;
        this.b = frgAttachVideo;
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        FrgAttachVideo frgAttachVideo = this.b;
        b bVarB0 = frgAttachVideo.b0();
        int measuredHeight = 0;
        if (bVarB0 != null) {
            int iA = fk4.a(frgAttachVideo.U0());
            if (bVarB0 instanceof ActAttachesView) {
                ActAttachesView actAttachesView = (ActAttachesView) bVarB0;
                View view2 = actAttachesView.X0;
                if (view2 != null) {
                    measuredHeight = (view2.getMeasuredHeight() - actAttachesView.l1.getMeasuredHeight()) + fk4.a(actAttachesView);
                }
            } else {
                measuredHeight = iA;
            }
        }
        Rect rect = new Rect(x6gVar.b(), x6gVar.d(), x6gVar.c(), x6gVar.a() + measuredHeight);
        wk9 wk9Var = frgAttachVideo.M1;
        if (wk9Var != null) {
            wk9Var.A(rect);
        }
        return x6gVar;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                FrgAttachVideo frgAttachVideo = this.b;
                frgAttachVideo.P1 = null;
                frgAttachVideo.j1();
                hm9.f0(frgAttachVideo.d0(), (File) obj, ((y8a) ((ed3) frgAttachVideo.p1.b)).h());
                break;
            default:
                FrgAttachVideo frgAttachVideo2 = this.b;
                frgAttachVideo2.P1 = null;
                frgAttachVideo2.j1();
                a14.K(frgAttachVideo2.d0(), jpc.X2);
                break;
        }
    }

    @Override // defpackage.fnb
    public void b() {
        die dieVar = this.b.P1;
        if (dieVar != null) {
            cqc.b((sd7) dieVar.o);
            Iterator it = ((List) dieVar.b).iterator();
            while (it.hasNext()) {
                ((lz) it.next()).a();
            }
        }
    }
}
