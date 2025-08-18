package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* loaded from: classes.dex */
public final class r21 {
    public final je7 a;

    public r21(je7 je7Var) {
        this.a = je7Var;
    }

    public final CameraManager a() {
        Conversation conversationA = ((fw3) this.a.getValue()).a();
        if (conversationA != null) {
            return conversationA.getCameraManager();
        }
        return null;
    }

    public final boolean b() {
        CameraManager cameraManagerA = a();
        return cameraManagerA != null && cameraManagerA.isCapturingFromFrontCamera();
    }
}
