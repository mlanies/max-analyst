package defpackage;

import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatmedia.viewer.photo.GifViewerWidget;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* loaded from: classes.dex */
public final class rg2 extends p04 {
    public final uu3 w0;
    public final String x0;
    public final iv y0;

    public rg2(uu3 uu3Var, ExecutorService executorService) {
        super(uu3Var, 0);
        this.w0 = uu3Var;
        this.x0 = "chatMediaViewer";
        this.y0 = new iv(new y8(this), new qz7(executorService, 4, new y34(4)));
    }

    @Override // defpackage.p04
    public final void E(znc zncVar, int i) {
        uu3 videoViewerWidget;
        uu3 uu3Var;
        if (zncVar.n()) {
            String name = rg2.class.getName();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                us7 us7Var = us7.X;
                coc cocVar = (coc) x53.q0(zncVar.e());
                ir6Var.d(us7Var, name, "Media viewer. Configure router | root exist | target exist:" + ((cocVar == null || (uu3Var = cocVar.a) == null) ? null : uu3Var.getTargetController()), null);
                return;
            }
            return;
        }
        sb8 sb8Var = (sb8) x53.j0(i, this.y0.f);
        if (sb8Var == null) {
            return;
        }
        long j = sb8Var.j();
        String strX = sb8Var.x();
        if (sb8Var instanceof jb8) {
            videoViewerWidget = ((jb8) sb8Var).X ? new GifViewerWidget(j, strX, this.x0, null) : new PhotoViewerWidget(j, strX, this.x0, null);
        } else {
            if (!(sb8Var instanceof qb8)) {
                throw new NoWhenBranchMatchedException();
            }
            videoViewerWidget = new VideoViewerWidget(j, strX, this.x0, null);
        }
        uu3 uu3Var2 = videoViewerWidget;
        uu3Var2.setTargetController(this.w0);
        uu3Var2.setRetainViewMode(tu3.b);
        zncVar.R(new coc(uu3Var2, null, null, null, false, -1));
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.y0.f.size();
    }

    @Override // defpackage.p04, defpackage.hdc
    public final long k(int i) {
        sb8 sb8Var = (sb8) x53.j0(i, this.y0.f);
        if (sb8Var != null) {
            return sb8Var.getItemId();
        }
        return 0L;
    }
}
