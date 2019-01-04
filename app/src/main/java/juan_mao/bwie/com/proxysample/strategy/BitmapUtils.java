package juan_mao.bwie.com.proxysample.strategy;

import android.graphics.Bitmap;

/**
 * Created by 卷猫~ on 2019/1/4.
 */

public class BitmapUtils {

    private BaseLoadBitmapStrategy loadBitmapStrategy;

    public Bitmap loadBitmap(String url) {
        Bitmap bitmap = loadBitmapStrategy.loadBitmap();
        return bitmap;
    }

    public void setLoadBitmapStrategy(BaseLoadBitmapStrategy loadBitmapStrategy) {
        this.loadBitmapStrategy = loadBitmapStrategy;
    }
}
