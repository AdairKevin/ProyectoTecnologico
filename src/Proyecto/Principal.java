package Proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(990, 589);
        
        Home p1 = new Home();
        p1.setSize(750, 550);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        Menu = new javax.swing.JPanel();
        Usuario = new Recursos.PanelRound();
        FotoUsuario = new Recursos.PanelRound();
        Foto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonSalir = new Recursos.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        NombreMenu = new Recursos.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        Ventas = new Recursos.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Productos = new Recursos.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Clientes = new Recursos.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Provedores = new Recursos.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Home = new Recursos.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(990, 550));
        setSize(new java.awt.Dimension(990, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(11, 12, 14));
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario.setBackground(new java.awt.Color(40, 40, 40));
        Usuario.setRoundBottomLeft(20);
        Usuario.setRoundBottomRight(20);
        Usuario.setRoundTopLeft(20);
        Usuario.setRoundTopRight(20);
        Usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FotoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        FotoUsuario.setRoundBottomLeft(100);
        FotoUsuario.setRoundBottomRight(100);
        FotoUsuario.setRoundTopLeft(100);
        FotoUsuario.setRoundTopRight(100);

        Foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-usuario-masculino-88.png"))); // NOI18N

        javax.swing.GroupLayout FotoUsuarioLayout = new javax.swing.GroupLayout(FotoUsuario);
        FotoUsuario.setLayout(FotoUsuarioLayout);
        FotoUsuarioLayout.setHorizontalGroup(
            FotoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FotoUsuarioLayout.createSequentialGroup()
                .addComponent(Foto)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FotoUsuarioLayout.setVerticalGroup(
            FotoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Foto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Usuario.add(FotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 88, 88));

        jLabel1.setFont(new java.awt.Font("Manrope", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Usuario:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Usuario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 0, 76, 45));

        jLabel3.setFont(new java.awt.Font("Manrope", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Usuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 51, 76, 49));

        Menu.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, 228, -1));

        BotonSalir.setBackground(new java.awt.Color(40, 239, 233));
        BotonSalir.setRoundBottomLeft(20);
        BotonSalir.setRoundBottomRight(20);
        BotonSalir.setRoundTopLeft(20);
        BotonSalir.setRoundTopRight(20);
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonSalirMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 255, 102));
        jLabel2.setFont(new java.awt.Font("Manrope", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Salir");

        javax.swing.GroupLayout BotonSalirLayout = new javax.swing.GroupLayout(BotonSalir);
        BotonSalir.setLayout(BotonSalirLayout);
        BotonSalirLayout.setHorizontalGroup(
            BotonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        BotonSalirLayout.setVerticalGroup(
            BotonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        Menu.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 121, 228, -1));

        NombreMenu.setBackground(new java.awt.Color(11, 12, 14));

        jLabel4.setBackground(new java.awt.Color(11, 12, 14));
        jLabel4.setFont(new java.awt.Font("Manrope", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Menu");

        javax.swing.GroupLayout NombreMenuLayout = new javax.swing.GroupLayout(NombreMenu);
        NombreMenu.setLayout(NombreMenuLayout);
        NombreMenuLayout.setHorizontalGroup(
            NombreMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        NombreMenuLayout.setVerticalGroup(
            NombreMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NombreMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(NombreMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, -1));

        Ventas.setBackground(new java.awt.Color(11, 12, 14));
        Ventas.setRoundBottomLeft(20);
        Ventas.setRoundBottomRight(20);
        Ventas.setRoundTopLeft(20);
        Ventas.setRoundTopRight(20);
        Ventas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                VentasMouseMoved(evt);
            }
        });
        Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VentasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VentasMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Manrope", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Ventas");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-maletín-20 (1).png"))); // NOI18N

        javax.swing.GroupLayout VentasLayout = new javax.swing.GroupLayout(Ventas);
        Ventas.setLayout(VentasLayout);
        VentasLayout.setHorizontalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        VentasLayout.setVerticalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu.add(Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 220, -1));

        Productos.setBackground(new java.awt.Color(11, 12, 14));
        Productos.setRoundBottomLeft(20);
        Productos.setRoundBottomRight(20);
        Productos.setRoundTopLeft(20);
        Productos.setRoundTopRight(20);
        Productos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ProductosMouseMoved(evt);
            }
        });
        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProductosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProductosMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Manrope", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Productos");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-terrón-de-azúcar-20.png"))); // NOI18N

        javax.swing.GroupLayout ProductosLayout = new javax.swing.GroupLayout(Productos);
        Productos.setLayout(ProductosLayout);
        ProductosLayout.setHorizontalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductosLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ProductosLayout.setVerticalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu.add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 220, -1));

        Clientes.setBackground(new java.awt.Color(11, 12, 14));
        Clientes.setRoundBottomLeft(20);
        Clientes.setRoundBottomRight(20);
        Clientes.setRoundTopLeft(20);
        Clientes.setRoundTopRight(20);
        Clientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ClientesMouseMoved(evt);
            }
        });
        Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClientesMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Manrope", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Clientes");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-llamada-de-conferencia-20.png"))); // NOI18N

        javax.swing.GroupLayout ClientesLayout = new javax.swing.GroupLayout(Clientes);
        Clientes.setLayout(ClientesLayout);
        ClientesLayout.setHorizontalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientesLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );
        ClientesLayout.setVerticalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu.add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 220, -1));

        Provedores.setBackground(new java.awt.Color(11, 12, 14));
        Provedores.setRoundBottomLeft(20);
        Provedores.setRoundBottomRight(20);
        Provedores.setRoundTopLeft(20);
        Provedores.setRoundTopRight(20);
        Provedores.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ProvedoresMouseMoved(evt);
            }
        });
        Provedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProvedoresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProvedoresMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Manrope", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Proveedores");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-proveedor-20.png"))); // NOI18N
        jLabel12.setToolTipText("");
        jLabel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel12MouseMoved(evt);
            }
        });
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });

        javax.swing.GroupLayout ProvedoresLayout = new javax.swing.GroupLayout(Provedores);
        Provedores.setLayout(ProvedoresLayout);
        ProvedoresLayout.setHorizontalGroup(
            ProvedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProvedoresLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ProvedoresLayout.setVerticalGroup(
            ProvedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu.add(Provedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 220, -1));

        Home.setBackground(new java.awt.Color(11, 12, 14));
        Home.setPreferredSize(new java.awt.Dimension(218, 35));
        Home.setRoundBottomLeft(20);
        Home.setRoundBottomRight(20);
        Home.setRoundTopLeft(20);
        Home.setRoundTopRight(20);
        Home.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HomeMouseMoved(evt);
            }
        });
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeMousePressed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Manrope", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Principal");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-página-principal-20.png"))); // NOI18N

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Menu.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, -1));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 550));

        content.setBackground(new java.awt.Color(240, 111, 41));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 750, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasMouseExited
        Ventas.setBackground(new Color(11,12,14));
    }//GEN-LAST:event_VentasMouseExited

    private void VentasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasMouseMoved
        Ventas.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_VentasMouseMoved

    private void ProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseExited
        Productos.setBackground(new Color(11,12,14));
    }//GEN-LAST:event_ProductosMouseExited

    private void ProductosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseMoved
        Productos.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_ProductosMouseMoved

    private void ClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesMouseExited
        Clientes.setBackground(new Color(11,12,14));
    }//GEN-LAST:event_ClientesMouseExited

    private void ClientesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesMouseMoved
        Clientes.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_ClientesMouseMoved

    private void ProvedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProvedoresMouseExited
        Provedores.setBackground(new Color(11,12,14));
    }//GEN-LAST:event_ProvedoresMouseExited

    private void ProvedoresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProvedoresMouseMoved
        Provedores.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_ProvedoresMouseMoved

    private void VentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasMousePressed
        
        ventas p1 = new ventas();
        p1.setSize(750, 550);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
    }//GEN-LAST:event_VentasMousePressed

    private void VentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasMouseClicked

    }//GEN-LAST:event_VentasMouseClicked

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        Home.setBackground(new Color(11,12,14));
    }//GEN-LAST:event_HomeMouseExited

    private void HomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseMoved
        Home.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_HomeMouseMoved

    private void HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMousePressed
        Home p1 = new Home();
        p1.setSize(750, 550);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_HomeMousePressed

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        Provedores.setBackground(new Color(11,12,14));
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseMoved
        Provedores.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_jLabel12MouseMoved

    private void ProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMousePressed
        Productos p1 = new Productos();
        p1.setSize(750, 550);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_ProductosMousePressed

    private void ClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesMousePressed
        Clientes p1 = new Clientes();
        p1.setSize(750, 550);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_ClientesMousePressed

    private void ProvedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProvedoresMousePressed
        Proveedores p1 = new Proveedores();
        p1.setSize(750, 550);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_ProvedoresMousePressed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        Proveedores p1 = new Proveedores();
        p1.setSize(750, 550);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jLabel12MousePressed

    private void BotonSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMousePressed
        int i = JOptionPane.showConfirmDialog(this, "¿Cerrar ventana?");
        if(i==0){
         System.exit(0);   
        } 
    }//GEN-LAST:event_BotonSalirMousePressed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Recursos.PanelRound BotonSalir;
    private Recursos.PanelRound Clientes;
    private javax.swing.JLabel Foto;
    private Recursos.PanelRound FotoUsuario;
    private Recursos.PanelRound Home;
    private javax.swing.JPanel Menu;
    private Recursos.PanelRound NombreMenu;
    private Recursos.PanelRound Productos;
    private Recursos.PanelRound Provedores;
    private Recursos.PanelRound Usuario;
    private Recursos.PanelRound Ventas;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
