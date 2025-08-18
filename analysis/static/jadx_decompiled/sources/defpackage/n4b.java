package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class n4b {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public n4b(y7d y7dVar) {
        JSONObject jSONObject;
        String name = n4b.class.getName();
        String strW = ((qyc) y7dVar).w(PmsKey.f99playerloadcontrol, null);
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, wg0.i("Server player control params=", strW), null);
        }
        if (strW != null) {
            try {
                jSONObject = new JSONObject(strW);
            } catch (JSONException e) {
                hm9.p(name, "Failed to parse player control params", e);
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            this.a = jSONObject.optBoolean("mp_autoplay_enabled", false);
            this.c = jSONObject.optBoolean("time_over_size", false);
            this.d = jSONObject.optInt("buffer_after_rebuffer_ms", 3000);
            this.e = jSONObject.optInt("min_buffer_ms", 5000);
            this.f = jSONObject.optInt("max_buffer_ms", 13000);
            this.g = jSONObject.optInt("buffer_ms", 500);
            this.b = jSONObject.optBoolean("use_min_size_lc", true);
            this.h = jSONObject.optInt("min_size_lc_fmt_mis_sf", 4);
        } else {
            this.a = false;
            this.c = false;
            this.d = 3000;
            this.e = 5000;
            this.f = 13000;
            this.g = 500;
            this.b = true;
            this.h = 4;
        }
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.X, name, toString(), null);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerControl(\n        isAutoPlayEnabledDuringMediaProcessing=");
        sb.append(this.a);
        sb.append("\n        isMinSizeLoadControlRequested=");
        sb.append(this.b);
        sb.append("\n        isPlaybackPrioritizeTimeOverSize=");
        sb.append(this.c);
        sb.append("\n        playbackMinBufferMs=");
        sb.append(this.e);
        sb.append("\n        playbackMaxBufferMs=");
        sb.append(this.f);
        sb.append("\n        playbackBufferMs=");
        sb.append(this.g);
        sb.append("\n        playbackBufferAfterRebufferMs=");
        sb.append(this.d);
        sb.append("\n        formatMaxInputSizeScaleUpFactor=");
        return zr6.j(sb, this.h, "\n        )\n        ");
    }
}
