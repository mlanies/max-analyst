package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gl8 {
    public final String a;
    public final String b = gl8.class.getName();
    public final khe c;
    public final khe d;
    public final khe e;
    public final khe f;

    public gl8(String str) {
        this.a = str;
        final int i = 0;
        this.c = new khe(new k56(this) { // from class: fl8
            public final /* synthetic */ gl8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        gl8 gl8Var = this.b;
                        String str2 = gl8Var.a;
                        if (str2 == null) {
                            return null;
                        }
                        try {
                            return new JSONObject(str2);
                        } catch (JSONException e) {
                            hm9.p(gl8Var.b, "Failed to parse media transform params", e);
                            return null;
                        }
                    case 1:
                        JSONObject jSONObject = (JSONObject) this.b.c.getValue();
                        return Boolean.valueOf(jSONObject != null ? jSONObject.optBoolean("enabled", false) : false);
                    case 2:
                        JSONObject jSONObject2 = (JSONObject) this.b.c.getValue();
                        return Boolean.valueOf(jSONObject2 != null ? jSONObject2.optBoolean("hevc_enabled", false) : false);
                    default:
                        JSONObject jSONObject3 = (JSONObject) this.b.c.getValue();
                        return Boolean.valueOf(jSONObject3 != null ? jSONObject3.optBoolean("hdr_enabled", false) : false);
                }
            }
        });
        final int i2 = 1;
        this.d = new khe(new k56(this) { // from class: fl8
            public final /* synthetic */ gl8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        gl8 gl8Var = this.b;
                        String str2 = gl8Var.a;
                        if (str2 == null) {
                            return null;
                        }
                        try {
                            return new JSONObject(str2);
                        } catch (JSONException e) {
                            hm9.p(gl8Var.b, "Failed to parse media transform params", e);
                            return null;
                        }
                    case 1:
                        JSONObject jSONObject = (JSONObject) this.b.c.getValue();
                        return Boolean.valueOf(jSONObject != null ? jSONObject.optBoolean("enabled", false) : false);
                    case 2:
                        JSONObject jSONObject2 = (JSONObject) this.b.c.getValue();
                        return Boolean.valueOf(jSONObject2 != null ? jSONObject2.optBoolean("hevc_enabled", false) : false);
                    default:
                        JSONObject jSONObject3 = (JSONObject) this.b.c.getValue();
                        return Boolean.valueOf(jSONObject3 != null ? jSONObject3.optBoolean("hdr_enabled", false) : false);
                }
            }
        });
        final int i3 = 2;
        this.e = new khe(new k56(this) { // from class: fl8
            public final /* synthetic */ gl8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        gl8 gl8Var = this.b;
                        String str2 = gl8Var.a;
                        if (str2 == null) {
                            return null;
                        }
                        try {
                            return new JSONObject(str2);
                        } catch (JSONException e) {
                            hm9.p(gl8Var.b, "Failed to parse media transform params", e);
                            return null;
                        }
                    case 1:
                        JSONObject jSONObject = (JSONObject) this.b.c.getValue();
                        return Boolean.valueOf(jSONObject != null ? jSONObject.optBoolean("enabled", false) : false);
                    case 2:
                        JSONObject jSONObject2 = (JSONObject) this.b.c.getValue();
                        return Boolean.valueOf(jSONObject2 != null ? jSONObject2.optBoolean("hevc_enabled", false) : false);
                    default:
                        JSONObject jSONObject3 = (JSONObject) this.b.c.getValue();
                        return Boolean.valueOf(jSONObject3 != null ? jSONObject3.optBoolean("hdr_enabled", false) : false);
                }
            }
        });
        final int i4 = 3;
        this.f = new khe(new k56(this) { // from class: fl8
            public final /* synthetic */ gl8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        gl8 gl8Var = this.b;
                        String str2 = gl8Var.a;
                        if (str2 == null) {
                            return null;
                        }
                        try {
                            return new JSONObject(str2);
                        } catch (JSONException e) {
                            hm9.p(gl8Var.b, "Failed to parse media transform params", e);
                            return null;
                        }
                    case 1:
                        JSONObject jSONObject = (JSONObject) this.b.c.getValue();
                        return Boolean.valueOf(jSONObject != null ? jSONObject.optBoolean("enabled", false) : false);
                    case 2:
                        JSONObject jSONObject2 = (JSONObject) this.b.c.getValue();
                        return Boolean.valueOf(jSONObject2 != null ? jSONObject2.optBoolean("hevc_enabled", false) : false);
                    default:
                        JSONObject jSONObject3 = (JSONObject) this.b.c.getValue();
                        return Boolean.valueOf(jSONObject3 != null ? jSONObject3.optBoolean("hdr_enabled", false) : false);
                }
            }
        });
    }
}
