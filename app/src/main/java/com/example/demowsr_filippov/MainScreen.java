package com.example.demowsr_filippov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainScreen extends AppCompatActivity {

    ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);

        ///getDishesData();
    }

   /* private void getDishesData() {
        String baseUrl = "https://food.madskill.ru/dishes?version=1.01";

        JSONArray json = new JSONArray();
        try {
            json.put(new JSONObject().put("version", 1.01));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        RequestQueue requestQueue = Volley.newRequestQueue(MainScreen.this);
        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, baseUrl, null,
                response ->
                {
                    addDishesData(response);
                    createRecyclerView();
                },
                error -> Toast.makeText(this, "Не удалось получить данные с сервера.", Toast.LENGTH_LONG).show());
        requestQueue.add(request);
    }

    private void addDishesData(JSONArray jsonArray) {
        JSONObject jsonObject = new JSONObject();

        String nameDish = "";
        String iconResource = "";
        int price = 0;

        String baseImageUrl = "https://food.madskill.ru/up/images/";

        for (int i = 0; i < jsonArray.length(); i++) {
            try {
                jsonObject = jsonArray.getJSONObject(i);
                nameDish = jsonObject.getString("nameDish");
                iconResource = jsonObject.getString("icon");
                price = Integer.parseInt(jsonObject.getString("price"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            menuItems.add(new MenuItem(nameDish, price, baseImageUrl.concat(iconResource)));
        }
    }*/

    private void createRecyclerView()
    {
        RecyclerView recyclerView = findViewById(R.id.list);
        MenuItemAdapter adapter = new MenuItemAdapter(this, menuItems);
        recyclerView.setAdapter(null);
        recyclerView.setLayoutManager(null);
        recyclerView.getRecycledViewPool().clear();
        recyclerView.swapAdapter(adapter, false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        adapter.notifyDataSetChanged();
    }
}