package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;

/* loaded from: classes.dex */
public final class xuc {
    public final je7 a;
    public final q0e b = r0e.a(Boolean.FALSE);

    public xuc(je7 je7Var) {
        this.a = je7Var;
    }

    public final void a(boolean z) {
        Object value;
        q0e q0eVar = this.b;
        do {
            value = q0eVar.getValue();
            ((Boolean) value).getClass();
        } while (!q0eVar.c(value, Boolean.valueOf(z)));
        Conversation conversationA = ((fw3) this.a.getValue()).a();
        ScreenCaptureManager screenCaptureManager = conversationA != null ? conversationA.getScreenCaptureManager() : null;
        if (screenCaptureManager != null) {
            screenCaptureManager.setAudioCaptureEnabled(z);
        }
    }

    public final void b(boolean z) {
        Conversation conversationA = ((fw3) this.a.getValue()).a();
        ScreenCaptureManager screenCaptureManager = conversationA != null ? conversationA.getScreenCaptureManager() : null;
        if (screenCaptureManager != null) {
            screenCaptureManager.setScreenCaptureEnabled(z, false);
        }
        if (z) {
            a(((Boolean) this.b.getValue()).booleanValue());
        } else {
            a(false);
        }
    }

    public final boolean c() {
        je7 je7Var = this.a;
        Conversation conversationA = ((fw3) je7Var.getValue()).a();
        if (conversationA != null && conversationA.isPrepared()) {
            Conversation conversationA2 = ((fw3) je7Var.getValue()).a();
            ScreenCaptureManager screenCaptureManager = conversationA2 != null ? conversationA2.getScreenCaptureManager() : null;
            if (screenCaptureManager != null && screenCaptureManager.isScreenCaptureEnabled()) {
                return true;
            }
        }
        return false;
    }
}
