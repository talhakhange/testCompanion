package com.example.android.testcompanion;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class viewPagerAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.mon, R.drawable.tue, R.drawable.wed, R.drawable.thu, R.drawable.fri, R.drawable.sat,R.drawable.sunday_3};

    public viewPagerAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position){
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout_schedule,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(position==0){
//                    Toast.makeText(context, "Slide 1 clicked", Toast.LENGTH_SHORT).show();
//                }else if(position==1){
//                    Toast.makeText(context, "Slide 2 clicked", Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(context, "Slide 3 clicked", Toast.LENGTH_SHORT).show();
//
//                }
//
//            }
//        });

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp = (ViewPager)container;
        View view = (View) object;
        vp.removeView(view);
    }
}
