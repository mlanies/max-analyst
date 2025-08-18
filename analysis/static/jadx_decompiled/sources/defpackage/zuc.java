package defpackage;

import android.content.Intent;
import android.media.projection.MediaProjection;
import java.util.concurrent.Executor;
import org.webrtc.ScreenCapturerAndroid;

/* loaded from: classes2.dex */
public final class zuc extends MediaProjection.Callback {
    public final ScreenCapturerAndroid a;
    public final a4c b;
    public volatile boolean c;
    public volatile boolean d;
    public int e;
    public int f;
    public int g;
    public final Executor h;

    public zuc(Intent intent, Executor executor, a4c a4cVar) {
        this.b = a4cVar;
        this.h = executor;
        this.a = new ScreenCapturerAndroid(intent, this);
    }

    public final void a(int i, int i2) {
        this.b.log("ScreenCapturerAdapter", wg0.h("changeFormat, ", i, "x", i2, "@30"));
        if (this.g == i && this.f == i2 && this.e == 30) {
            return;
        }
        this.e = 30;
        this.f = i2;
        this.g = i;
        if (this.d) {
            this.b.log("ScreenCapturerAdapter", "Screen capture is already started, just change capture format");
            try {
                this.a.changeCaptureFormat(i, i2, 30);
            } catch (Exception e) {
                this.b.reportException("ScreenCapturerAdapter", "screen.capture.change.format", new RuntimeException("Cant change screen capture format", e));
            }
        }
    }

    public final void b() {
        this.b.log("ScreenCapturerAdapter", "release");
        c();
        this.a.dispose();
    }

    public final void c() {
        this.b.log("ScreenCapturerAdapter", "stop");
        if (!this.d) {
            this.b.log("ScreenCapturerAdapter", "Screen capturer is not yet started");
            return;
        }
        this.d = false;
        try {
            this.a.stopCapture();
        } catch (Exception e) {
            this.b.reportException("ScreenCapturerAdapter", "screen.capture.stop", new RuntimeException("Stop screen capture failed", e));
        }
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        this.b.log("ScreenCapturerAdapter", "onStop, screen capture session stopped");
        this.c = true;
        this.h.execute(new u3c(8, this));
    }
}
