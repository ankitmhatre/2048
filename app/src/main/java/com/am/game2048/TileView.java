package com.am.game2048;

import android.graphics.Canvas;
import android.graphics.RectF;

/**
 * Created by Ankit Mhatre on 02/11/21.
 */

public interface TileView {
    void draw( Canvas c, RectF rect, int rang, float howCloseToDissapear );
}