package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.j0;
import com.my.tracker.obfuscated.s0;

/* loaded from: classes.dex */
final class t0 implements s0 {
    private final j0 a;

    public static final class a implements s0.a {
        private final j0 a;
        private final j0.b b;

        public a(j0 j0Var, j0.b bVar) {
            this.a = j0Var;
            this.b = bVar;
        }

        @Override // com.my.tracker.obfuscated.s0.a
        public boolean a() {
            return this.b.a();
        }

        @Override // com.my.tracker.obfuscated.s0.a
        public long b() {
            return this.b.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.b.close();
        }

        @Override // com.my.tracker.obfuscated.s0.a
        public s0.b d() {
            return new b(this.a.c(this.b.c()));
        }

        @Override // com.my.tracker.obfuscated.s0.a
        public long f() {
            return this.b.f();
        }

        @Override // com.my.tracker.obfuscated.s0.a
        public byte[] l() {
            return this.b.l();
        }
    }

    public static final class b implements s0.b {
        private final j0.c a;

        public b(j0.c cVar) {
            this.a = cVar;
        }

        @Override // com.my.tracker.obfuscated.s0.b
        public boolean a() {
            return this.a.a();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // com.my.tracker.obfuscated.s0.b
        public long k() {
            return this.a.k();
        }
    }

    public t0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // com.my.tracker.obfuscated.s0
    public s0.a a() {
        j0 j0Var = this.a;
        return new a(j0Var, j0Var.g());
    }
}
