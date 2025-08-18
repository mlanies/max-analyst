package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class xz1 extends oy {
    public final /* synthetic */ int c;
    public final /* synthetic */ CarouselLayoutManager o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz1(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 4);
        this.c = i;
        switch (i) {
            case 1:
                this.o = carouselLayoutManager;
                super(0, 4);
                break;
            default:
                this.o = carouselLayoutManager;
                break;
        }
    }

    @Override // defpackage.oy
    public final int h() {
        switch (this.c) {
            case 0:
                return this.o.o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.o;
                return carouselLayoutManager.o - carouselLayoutManager.I();
        }
    }

    @Override // defpackage.oy
    public final int j() {
        switch (this.c) {
            case 0:
                return this.o.J();
            default:
                return 0;
        }
    }

    @Override // defpackage.oy
    public final int k() {
        switch (this.c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.o;
                return carouselLayoutManager.n - carouselLayoutManager.K();
            default:
                return this.o.n;
        }
    }

    @Override // defpackage.oy
    public final int l() {
        switch (this.c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.o;
                if (carouselLayoutManager.P0()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    @Override // defpackage.oy
    public final int m() {
        switch (this.c) {
            case 0:
                return 0;
            default:
                return this.o.L();
        }
    }
}
