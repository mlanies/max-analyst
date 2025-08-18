package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.c0;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class m implements c0.a {
    private final l a;

    public m(l lVar) {
        this.a = lVar;
    }

    @Override // com.my.tracker.obfuscated.c0.a
    public String a() {
        return "application/octet-stream";
    }

    @Override // com.my.tracker.obfuscated.c0.a
    public void a(OutputStream outputStream) {
        this.a.a(outputStream);
    }
}
