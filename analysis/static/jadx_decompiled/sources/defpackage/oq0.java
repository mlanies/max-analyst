package defpackage;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class oq0 {
    public static final oq0 c;
    public boolean a;
    public boolean b;

    static {
        boolean z = false;
        c = new oq0(z, z);
    }

    public /* synthetic */ oq0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public oq0(bj6 bj6Var, int i) {
        boolean z;
        switch (i) {
            case 4:
                this.b = false;
                this.a = bj6Var.e(AutoFlashUnderExposedQuirk.class) != null;
                break;
            case 5:
            default:
                this.a = bj6Var.d(ImageCaptureFailWithAutoFlashQuirk.class);
                this.b = zi4.a.e(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                break;
            case 6:
                Iterator it = bj6Var.f(CaptureIntentPreviewQuirk.class).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                    } else if (((CaptureIntentPreviewQuirk) it.next()).c()) {
                        z = true;
                    }
                }
                this.a = z;
                this.b = bj6Var.d(ImageCaptureFailedForVideoSnapshotQuirk.class);
                break;
        }
    }
}
